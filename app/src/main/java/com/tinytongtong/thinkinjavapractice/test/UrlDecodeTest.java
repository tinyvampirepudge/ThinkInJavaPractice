package com.tinytongtong.thinkinjavapractice.test;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlDecodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 有问题的cookie，不包含253A
		String s1 = "7%3A2%3A394024970%3A13718150827%3A1%3A1513337566%3Ae8a5865b7771464";
		// 没问题的cookie，包含253A
		String s2 = "7%253A2%253A394024970%253A13718150827%253A1%253A1513337566%253Ae8a5865b7771464";

		System.out.println("有问题的cookie encode一次 == 没问题的cookie");
		System.out.println(URLEncoder.encode(s1));
		System.out.println(s2);
		System.out.println("----------------------");

		System.out.println("没问题的cookie decode一次 == 有问题的cookie");
		System.out.println(s1);
		System.out.println(URLDecoder.decode(s2));
		System.out.println("----------------------");

		System.out.println(
				"没问题的cookie decode二次 == 有问题的cookie decode一次，都带有冒号，\n" + "所以根据冒号校验cookie是否登录即可, 不能使用之前的\"253A\"校验了");
		System.out.println(URLDecoder.decode(s1));
		System.out.println(URLDecoder.decode(URLDecoder.decode(s2)));
		System.out.println("----------------------");

	}

}
