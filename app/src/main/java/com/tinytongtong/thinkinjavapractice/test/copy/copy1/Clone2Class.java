package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

import java.util.List;

public class Clone2Class {
	public String c2;
	public List<Clone3Class> c3List;
	public String getC2() {
		return c2;
	}
	public void setC2(String c2) {
		this.c2 = c2;
	}
	public List<Clone3Class> getC3List() {
		return c3List;
	}
	public void setC3List(List<Clone3Class> c3List) {
		this.c3List = c3List;
	}
	@Override
	public String toString() {
		return "Clone2Class [c2=" + c2 + ", c3List=" + c3List + "]";
	}
	
}
