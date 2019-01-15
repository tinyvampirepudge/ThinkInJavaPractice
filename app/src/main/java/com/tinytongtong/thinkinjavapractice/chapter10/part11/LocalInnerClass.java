package com.tinytongtong.thinkinjavapractice.chapter10.part11;

/**
 * 局部内部类和匿名内部类的区别
 * 
 * @author tiny
 *
 */
public class LocalInnerClass {
	private int count = 0;

	Counter getCounter(final String name) {
		/**
		 * 局部内部类
		 * 
		 * @author tiny
		 *
		 */
		class LocalCounter implements Counter {

			/**
			 * 局部内部类可以有构造器
			 */
			public LocalCounter() {
				System.out.println("LocalCounter()");
			}

			@Override
			public int next() {
				/**
				 * 内部类使用外部的局部变量时，需要final修饰。
				 */
				System.out.print(name + ":");
				return count++;
			}

		}
		return new LocalCounter();
	}

	/**
	 * 使用匿名内部类实现
	 * 
	 * @param name
	 * @return
	 */
	Counter getCounter2(final String name) {
		return new Counter() {
			/**
			 * 匿名内部类不能有具名构造器，只可以进行实例初始化
			 */
			{
				System.out.println("Counter()");
			}

			@Override
			public int next() {
				/**
				 * 内部类使用外部的局部变量时，需要final修饰。
				 */
				System.out.print(name + ":");
				return count++;
			}
		};
	}

	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter c1 = lic.getCounter("Local Inner");
		Counter c2 = lic.getCounter2("Annoymous inner");

		for (int i = 0; i < 5; i++) {
			System.out.println(c1.next());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(c2.next());
		}
	}

}

interface Counter {
	int next();
}