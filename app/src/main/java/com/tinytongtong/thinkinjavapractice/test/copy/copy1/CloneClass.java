package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

/**
 * 实现clone（）方法是其中最简单，也是最高效的手段。
 * 
 * @author tiny
 *
 */
public class CloneClass implements Cloneable {
	public int aInt;

	@Override
	public Object clone() throws CloneNotSupportedException {
		CloneClass o = null;
		// TODO Auto-generated method stub
		try {
			o = (CloneClass) super.clone();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}

}
