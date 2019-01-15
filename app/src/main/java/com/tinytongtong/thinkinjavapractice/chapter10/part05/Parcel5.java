package com.tinytongtong.thinkinjavapractice.chapter10.part05;


import com.tinytongtong.thinkinjavapractice.chapter10.part04.Destination;

public class Parcel5 {
	
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;
			
			public PDestination(String label) {
				super();
				this.label = label;
			}

			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
			
		}
		return new PDestination(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel5 parcel5 = new Parcel5();
		Destination destination = parcel5.destination("tiny");
	}

}
