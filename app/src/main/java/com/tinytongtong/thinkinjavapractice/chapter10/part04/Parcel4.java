package com.tinytongtong.thinkinjavapractice.chapter10.part04;

public class Parcel4 {

	private class PContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}

	}
	
	protected class PDestination implements Destination{
		private String label;
		
		public PDestination(String label) {
			this.label = label;
		}

		@Override
		public String readLabel() {
			return label;
		}
		
		public void f() {
			System.out.println("不仅仅是喜欢");
		}
	}
	
	public Destination destination(String s) {
		return new PDestination(s);
	}
	
	public Contents contents() {
		return new PContents();
	}

	public static void main(String[] args) {
		Parcel4 parcel4 = new Parcel4();
		Contents contents = parcel4.contents();
		Destination destination = parcel4.destination("tiny");
	
		/**
		 * 可以访问到，因为Parcel4.PContents是private修饰的
		 */
		PContents pc = parcel4.new PContents();
		//外部类可以访问其内部类的private元素。
		pc.i = 10;
	}
}
