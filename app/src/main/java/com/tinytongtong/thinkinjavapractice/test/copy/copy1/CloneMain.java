package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

public class CloneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneB b1 = new CloneB();
		b1.aInt = 11;
		System.out.println("before clone, b1.aInt = " + b1.aInt);
		System.out.println("before clone, b1.unCLoneA = " + b1.unCLoneA);
		System.out.println("-------------------------");
		CloneB b2 = (CloneB) b1.clone();
		b2.aInt = 22;
		b2.unCLoneA.doubleValue();
		System.out.println("after clone, b1.aInt = " + b1.aInt);
		System.out.println("after clone, b1.unCLoneA = " + b1.unCLoneA);
		System.out.println("--------------------------");
		System.out.println("after clone, b2.aInt = " + b2.aInt);
		System.out.println("after clone, b2.unCLoneA = " + b2.unCLoneA);
	}

}
