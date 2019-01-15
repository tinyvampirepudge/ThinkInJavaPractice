package com.tinytongtong.thinkinjavapractice.chapter10.part06;


import com.tinytongtong.thinkinjavapractice.chapter10.part04.Contents;

public class Parcel7 {
	
	public Contents contents(){
		return new Contents() {
			private int i = 11;
			@Override
			public int value() {
				return i;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel7 parcel7 = new Parcel7();
		Contents contents = parcel7.contents();
	}

}
