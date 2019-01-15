package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

public class ObjRef {
	Obj aObj = new Obj();
	int aInt = 11;
	String aString = "maolegemi";

	public void changeObj(Obj obj) {
		obj.string = "changed value";
	}
	
	public void changePri(int inInt){
		inInt = 22;
	}
	public void changeString(String string){
		string = "adsfasdf";
	}
	
	public static void main(String[] args) {
		ObjRef oRef = new ObjRef();
		System.out.println(oRef.aObj);
		oRef.changeObj(oRef.aObj);
		System.out.println(oRef.aObj);
		System.out.println("----------------");
		System.out.println(oRef.aInt);
		oRef.changePri(oRef.aInt);
		System.out.println(oRef.aInt);
		System.out.println("----------------");
		System.out.println(oRef.aString);
		oRef.changeString(oRef.aString);
		System.out.println(oRef.aString);
	}
}
