package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

public class UnCLoneA implements Cloneable {
	private int i;

	public UnCLoneA(int ii) {
		this.i = ii;
	}

	public void doubleValue() {
		i *= 2;
	}

	@Override
	protected Object clone() {
		UnCLoneA o = null;
		// TODO Auto-generated method stub
		try {
			o = (UnCLoneA) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Integer.toString(i);
	}

}
