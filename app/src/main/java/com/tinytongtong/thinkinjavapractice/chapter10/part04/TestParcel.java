package com.tinytongtong.thinkinjavapractice.chapter10.part04;


public class TestParcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel4 parcel4 = new Parcel4();
		Contents contents = parcel4.contents();
		Destination destination = parcel4.destination("tiny");
		
		/**
		 * protected修饰的可以访问到，private修饰的内部类被隐藏了，访问不到
		 */
		Parcel4.PDestination pDestination = (Parcel4.PDestination) destination;
		pDestination.f();
		
		/**
		 * 无法访问到，因为Parcel4.PContents是private修饰的
		 */
//		Parcel4.PContents pc = parcel4.new PContents();
	}

}
