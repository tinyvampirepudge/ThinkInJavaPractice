package com.tinytongtong.thinkinjavapractice.chapter10.part05;

public class Parcel6 {
	
	private void internalTracking(boolean b){
		if (b) {
			class TrackingSlip{
				private String id;

				public TrackingSlip(String id) {
					this.id = id;
				}
				
				String getSlip(){
					return id;
				}
			}
			/**
			 * 可以在这里使用TrackingSlip
			 */
			TrackingSlip trackingSlip = new TrackingSlip("slip");
			String s = trackingSlip.getSlip();
		}
		/**
		 * 不可以在这里使用了，作用域之外了。
		 */
//		TrackingSlip trackingSlip = new TrackingSlip("slip");
		
	}
	
	public void track() {
		internalTracking(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel6 parcel6 = new Parcel6();
		parcel6.track();
	}

}
