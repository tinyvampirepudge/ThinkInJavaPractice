package com.tinytongtong.thinkinjavapractice.test.copy;

public class CopyTest1 {

	public static void main(String[] args) {
		Person p1 = new Person("李四", "man", 23);
		System.out.println(p1);
		System.out.println(p1.hashCode());
		Person p2 = new Person(p1);
		System.out.println(p2);
		System.out.println(p2.hashCode());
		Person p3 = p1;
		System.out.println(p3);
		System.out.println(p3.hashCode());
		System.out.println("-------------------------");

		Asian a1 = new Asian("yellow", new Person("张三", "woman", 24));
		System.out.println(a1);
		System.out.println(a1.hashCode());
		System.out.println(a1.person.hashCode());
		Asian a2 = new Asian(a1);
		System.out.println(a2);
		System.out.println(a2.hashCode());
		System.out.println(a2.person.hashCode());
		
		//modify
		a1.setSkin("green");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("-------------------------");
		
		a1.person.setAge(54);
		System.out.println(a1);
		System.out.println(a2);
	}

}
