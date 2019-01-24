package com.tinytongtong.thinkinjavapractice.chapter21.part03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: 同步代码块
 * @Author wangjianzhou@qding.me
 * @Date 2019/1/23 6:07 PM
 * @Version
 */

/**
 * 正如注释中注明的，Pair不是线程安全的，因为它的约束条件（虽然是任意的）需要
 * 将两个变量维护成相同的值。
 * 此外，自增加操作不是线程安全的，并且因为没有任何方法被标记为synchronized，
 * 所以不能保证一个Pair对象在多线程程序中不会被破坏。
 * 你可以想象一下这种情况：某人交给你一个非线程安全的Pair类，而你需要在一个线程
 * 环境中使用它。通过创建PairManager类就可以实现这一点，PairManager类持有一
 * 个Pair对象并控制对它的一切访问。注意唯一的public方法就是getPair()，它是
 * synchronized的。对于抽象方法increment()，对increment()的同步控制将在
 * 实现的时候进行处理。
 *
 * store()方法将一个Pair对象添加到了synchronized ArrayList中，所以这个操作
 * 是线程安全的。因此，该方法不必进行防护，可以防止在PairManager2的synchronized
 * 语句块的外部。
 *
 * PairManipulator被创建用来测试两种不同类型的PairManager，其方法时某个任务
 * 中调用increment()，而PairChecker则在另一个任务中执行。为了跟踪可以运行测试
 * 的频度，PairChecker在每次成功时都递增checkCounter。
 *
 * 在main()中创建了两个PairManipulator对象，并允许他们运行一段时间，之后每个
 * PairManipulator的结果都会得到展示。
 *
 * 尽管每次运行的结果可能会非常不同，但一般来说，对于PairChecker的检查频率，
 * PairManager1.increment()不允许有PairManager2.increment()那样多。后者
 * 采用同步控制块进行同步，所以对象不加锁的时间更长。这也是宁愿使用同步控制块而不是
 * 对整个方法进行同步控制的典型原因：使得其他线程能更多地访问（在安全的情况下尽可能多）。
 */
public class CriticalSection {
    // Test the two different approaches:
    public static void main(String[] args) {
        PairManager pman1 = new PairManager1();
        PairManager pman2 = new PairManager2();
        testApproaches(pman1, pman2);
    }

    static void testApproaches(PairManager pman1, PairManager pman2) {
        ExecutorService exec = Executors.newCachedThreadPool();
        PairManipulator pm1 = new PairManipulator(pman1);
        PairManipulator pm2 = new PairManipulator(pman2);
        PairChecker pcheck1 = new PairChecker(pman1);
        PairChecker pcheck2 = new PairChecker(pman2);

        exec.execute(pm1);
        exec.execute(pm2);
        exec.execute(pcheck1);
        exec.execute(pcheck2);

        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Sleep interrupted");
        }
        System.out.println("pm1: " + pm1 + "\npm2: " + pm2);
        System.exit(0);
    }
}

class Pair { // Not thread-safe
    private int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pair() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incrementX() {
        x++;
    }

    public void incrementY() {
        y++;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }

    public class PairValuesNotEqualException extends RuntimeException {
        public PairValuesNotEqualException() {
            super("Pair values not equal: " + Pair.this);
        }
    }

    // Arbitrary invariant -- both variables must be equal:
    public void checkState() {
        if (x != y) {
            throw new PairValuesNotEqualException();
        }
    }
}

// Protect a Pair inside a thread-safe class:
abstract class PairManager {
    AtomicInteger checkCounter = new AtomicInteger(0);
    protected Pair p = new Pair();
    private List<Pair> storage = Collections.synchronizedList(new ArrayList<Pair>());

    public synchronized Pair getPair() {
        // Make a copy to keep original safe:
        return new Pair(p.getX(), p.getY());
    }

    // Assume this is a time consuming operation
    protected void store(Pair p) {
        storage.add(p);
        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public abstract void increment();
}

// Synchronize the entire method:
class PairManager1 extends PairManager {

    @Override
    public synchronized void increment() {
        p.incrementX();
        p.incrementY();
        store(getPair());
    }
}

// Use a critical section:
class PairManager2 extends PairManager {

    @Override
    public void increment() {
        Pair temp;
        synchronized (this) {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        }
        store(temp);// 这个方法是线程安全的，不用放置在同步代码块中。这是因为list是 synchronized ArrayList。
    }
}

class PairManipulator implements Runnable {
    private PairManager pm;

    public PairManipulator(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            pm.increment();
        }
    }

    @Override
    public String toString() {
        return "Pair: " + pm.getPair() + " checkCounter= " + pm.checkCounter.get();
    }
}

class PairChecker implements Runnable {
    private PairManager pm;

    public PairChecker(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            pm.checkCounter.incrementAndGet();
            pm.getPair().checkState();
        }
    }
}
