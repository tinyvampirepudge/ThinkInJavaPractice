package com.tinytongtong.thinkinjavapractice.chapter10.part06;

public class Parcel8 {
	public Wrapping wrapping(int i) {
		return new Wrapping(i) {

			@Override
			public int value() {
				return super.value() * 47;
			}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel8 parcel8 = new Parcel8();
		Wrapping wrapping = parcel8.wrapping(8);
		System.out.println("wrapping.value():" + wrapping.value());
	}

}
