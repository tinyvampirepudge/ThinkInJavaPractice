package com.tinytongtong.thinkinjavapractice.chapter10.part10;

/**
 * 覆盖内部类，默认是不会覆盖的，它两个内部类是完全独立地两个实体，各自在自己的命名空间内。
 * @author tiny
 *
 */
public class BigEgg extends Egg{
	public class Yolk{
		public Yolk() {
			System.out.println("BigEgg.Yolk()");
		}
		
	}
	public static void main(String[] args) {
		new BigEgg();
	}

}

class Egg{
	private Yolk y;
	protected class Yolk {

		public Yolk() {
			System.out.println("Egg.Yolk()");
		}
		
	}
	public Egg() {
		System.out.println("new Egg()");
		y = new Yolk();
	}
	
}