package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

public class CloneC implements Cloneable{
	public String str;
	public StringBuffer strBuffer;
	@Override
	public Object clone() {
		CloneC c = null;
		// TODO Auto-generated method stub
		try {
			c = (CloneC) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
}
