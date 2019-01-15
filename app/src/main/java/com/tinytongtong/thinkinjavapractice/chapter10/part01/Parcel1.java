package com.tinytongtong.thinkinjavapractice.chapter10.part01;

public class Parcel1 {
	
	class Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	
	class Destination{
		private String label;
		public Destination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}
		String readLabel(){
			return label;
		}
		
	}
	
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel1 p = new Parcel1();
		p.ship("Tasmania");
	}

}
