package com.tinytongtong.thinkinjavapractice.chapter15.part02;

public class FiveTuple<A,B,C,D,E> extends FourTuple<A, B, C, D> {
	public final E fifth;

	public FiveTuple(A first, B second, C third, D forth, E fifth) {
		super(first, second, third, forth);
		this.fifth = fifth;
	}

	@Override
	public String toString() {
		return "FiveTuple [fifth=" + fifth + ", forth=" + forth + ", third=" + third + ", first=" + first + ", second="
				+ second + "]";
	}
	
}
