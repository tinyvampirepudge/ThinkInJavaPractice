package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

public class CloneB implements Cloneable{
	public int aInt;
	public UnCLoneA unCLoneA = new UnCLoneA(111);
	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		CloneB o = null;
		try {
			o = (CloneB) super.clone();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		o.unCLoneA = (UnCLoneA) unCLoneA.clone();
		return o;
	}
}
