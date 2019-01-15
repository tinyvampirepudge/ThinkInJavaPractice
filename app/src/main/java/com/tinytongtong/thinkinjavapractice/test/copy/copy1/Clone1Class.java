package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

import java.util.List;

public class Clone1Class implements Cloneable {
	public String cl;
	public List<Clone2Class> list2;
	public Clone2Class c2;

	@Override
	public Object clone() {
		Clone1Class clone1Class = null;
		try {
			clone1Class = (Clone1Class) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone1Class;
	}

	public String getCl() {
		return cl;
	}

	public void setCl(String cl) {
		this.cl = cl;
	}

	public List<Clone2Class> getList2() {
		return list2;
	}

	public void setList2(List<Clone2Class> list2) {
		this.list2 = list2;
	}
	

	public Clone2Class getC2() {
		return c2;
	}

	public void setC2(Clone2Class c2) {
		this.c2 = c2;
	}

	@Override
	public String toString() {
		return "Clone1Class [cl=" + cl + ", list2=" + list2 + ", c2=" + c2 + "]";
	}

	

}
