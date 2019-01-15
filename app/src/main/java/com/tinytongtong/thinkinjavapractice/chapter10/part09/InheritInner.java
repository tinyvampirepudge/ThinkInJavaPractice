package com.tinytongtong.thinkinjavapractice.chapter10.part09;

public class InheritInner extends WithInner.Inner{
	
	public InheritInner(WithInner wi) {
		//特殊语法。
		wi.super();
		
	}

	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}

}

class WithInner{
	class Inner{}
}
