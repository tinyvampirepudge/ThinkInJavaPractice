package com.tinytongtong.thinkinjavapractice.chapter10.part10;

/**
 * 通过特殊实现来覆盖父类的内部类。
 * @author tiny
 *
 */
public class BigEgg2 extends Egg2 {

	public class Yolk extends Egg2.Yolk {

		public Yolk() {
			System.out.println("BigEgg2.Yolk()");
		}

		public void f() {
			System.out.println("BigEgg2.Yolk.f()");
		}
	}

	public BigEgg2() {
		/**
		 * 调用父类的方法，将这里的Yolk赋值给父类的外部类
		 */
		insertYolk(new Yolk());
	}

	public static void main(String[] args) {
		Egg2 e2 = new BigEgg2();
		e2.g();
	}

}

class Egg2 {
	protected class Yolk {

		public Yolk() {
			System.out.println("Egg2.yolk()");
		}

		public void f() {
			System.out.println("Egg2.Yolk.f()");
		}
	}

	private Yolk y = new Yolk();

	public Egg2() {
		System.out.println("New Egg2()");
	}

	/**
	 * 为了实现继承这个内部类，做的一些操作。
	 * @param yy
	 */
	public void insertYolk(Yolk yy) {
		y = yy;
	}

	public void g() {
		y.f();
	}
}