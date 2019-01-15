package com.tinytongtong.thinkinjavapractice.chapter19.part01;

enum Shrubbery {
	GROUND, CRAWLING, HANGING
}

public class EnumClass {
	public static void main(String[] args) {
		for (Shrubbery s : Shrubbery.values()) {
			// ordinal
			System.out.println(s + " ordinal: " + s.ordinal());
			// compareTo
			System.out.println("s.compareTo(Shrubbery.CRAWLING) --> " + s.compareTo(Shrubbery.CRAWLING));
			// equals
			System.out.println("s.equals(Shrubbery.CRAWLING) --> " + s.equals(Shrubbery.CRAWLING));
			// ==
			System.out.println("s == Shrubbery.CRAWLING --> " + (s == Shrubbery.CRAWLING));
			// getDeclaringClass
			System.out.println("s.getDeclaringClass() --> " + s.getDeclaringClass());
			// name
			System.out.println("s.name() --> " + s.name());
		}
	}
}
