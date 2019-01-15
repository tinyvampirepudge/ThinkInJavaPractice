package com.tinytongtong.thinkinjavapractice.chapter15.part02;

public class FourTuple<A,B,C,D> extends ThreeTuple<A, B, C>{
	public final D forth;

	public FourTuple(A first, B second, C third, D forth) {
		super(first, second, third);
		this.forth = forth;
	}

	@Override
	public String toString() {
		return "FourTuple [forth=" + forth + ", third=" + third + ", first=" + first + ", second=" + second + "]";
	}
	
}
