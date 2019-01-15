package com.tinytongtong.thinkinjavapractice.test;

public class EnumTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (TypeEnum type : TypeEnum.values()) {
			System.out.println(type);
		}
		System.out.println(TypeEnum.TYPE_ABC.ordinal());
		System.out.println(TypeEnum.TYPE_DEF.ordinal());
		System.out.println(TypeEnum.TYPE_GHI.ordinal());
	}

}

enum TypeEnum{
	TYPE_ABC,TYPE_DEF,TYPE_GHI
}
