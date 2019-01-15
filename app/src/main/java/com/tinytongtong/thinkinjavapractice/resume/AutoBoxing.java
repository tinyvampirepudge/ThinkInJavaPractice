package com.tinytongtong.thinkinjavapractice.resume;

/**
 * java进阶--深入理解Java自动装箱拆箱机制
 * 
 * @author tiny
 *
 */
public class AutoBoxing {

	public static void main(String[] args) {
		System.out.println("int start -----------------");
		// int缓存区大小为 -128 - 127，
		// 1  两个对象，比较的是堆内存地址值
		Integer a = new Integer(123);
		Integer b = new Integer(123);
		System.out.println(a == b);// 输出 false

		// 2  自动装箱,Integer.valueOf(i),并且数值范围在缓存区中，所以都取的是缓存区中的值。
		Integer c = 123;
		Integer d = 123;
		System.out.println(c == d);// 输出 true

		// 3  自动装箱，Integer.valueOf(i),并且数值范围不在缓存区中，都是new Integer(i)，生成了新的对象，所以比较的是堆内存地址值。
		Integer e = 129;
		Integer f = 129;
		System.out.println(e == f);// 输出 false
		// 4 比较时会自动拆箱，实质上是 g == h.intValue()
		int g = 59;
		Integer h = new Integer(59);
		System.out.println(g == h);// 输出 true
		
		System.out.println("int end -----------------");
		
		System.out.println("byte start -----------------");
		// byte缓存区大小为 -128 - 127，
		// 1  两个对象，比较的是堆内存地址值
		Byte a1 = new Byte((byte) 123);
		Byte b1 = new Byte((byte) 123);
		System.out.println(a1 == b1);// 输出 false

		// 2  自动装箱,Byte.valueOf(i),并且数值范围在缓存区中，所以都取的是缓存区中的值。
		Byte c1 = 123;
		Byte d1 = 123;
		System.out.println(c1 == d1);// 输出 true

		// 3  比较时会自动拆箱，实质上是 g1 == h1.byteValue()
		Byte g1 = 59;
		Byte h1 = new Byte((byte) 59);
		System.out.println(g1 == h1);// 输出 true
		
		System.out.println("byte end -----------------");
		
		System.out.println("short start -----------------");
		// short缓存区大小为 -128 - 127，
		// 1  两个对象，比较的是堆内存地址值
		Short a2 = new Short((short) 123);
		Short b2 = new Short((short) 123);
		System.out.println(a2 == b2);// 输出 false

		// 2  自动装箱,Short.valueOf(i),并且数值范围在缓存区中，所以都取的是缓存区中的值。
		Short c2 = 123;
		Short d2 = 123;
		System.out.println(c2 == d2);// 输出 true

		// 3  自动装箱，Short.valueOf(i),并且数值范围不在缓存区中，都是new Short(i)，生成了新的对象，所以比较的是堆内存地址值。
		Short e2 = 129;
		Short f2 = 129;
		System.out.println(e2 == f2);// 输出 false
		// 4 比较时会自动拆箱，实质上是 g == h.shortValue()
		short g2 = 59;
		Short h2 = new Short((short) 59);
		System.out.println(g2 == h2);// 输出 true
		
		System.out.println("short end -----------------");
		
		System.out.println("long start -----------------");
		// long缓存区大小为 -128 - 127，
		// 1  两个对象，比较的是堆内存地址值
		Long a3 = new Long(123);
		Long b3 = new Long(123);
		System.out.println(a3 == b3);// 输出 false

		// 2  自动装箱,Long.valueOf(i),并且数值范围在缓存区中，所以都取的是缓存区中的值。
		Long c3 = 123l;
		Long d3 = 123l;
		System.out.println(c3 == d3);// 输出 true

		// 3  自动装箱，Long.valueOf(i),并且数值范围不在缓存区中，都是new Long(i)，生成了新的对象，所以比较的是堆内存地址值。
		Long e3 = 129l;
		Long f3 = 129l;
		System.out.println(e3 == f3);// 输出 false
		// 4 比较时会自动拆箱，实质上是 g == h.longValue()
		long g3 = 59;
		Long h3 = new Long(59);
		System.out.println(g3 == h3);// 输出 true
		
		System.out.println("long end -----------------");
		
		System.out.println("float start -----------------");
		//Float没有缓存。
		// 1  两个对象，比较的是堆内存地址值
		Float a4 = new Float(123);
		Float b4 = new Float(123);
		System.out.println(a4 == b4);// 输出 false

		// 2  自动装箱,Float.valueOf(i), return new Float(f); 比较的是堆内存地址值。
		Float c4 = 123f;
		Float d4 = 123f;
		System.out.println(c4 == d4);// 输出 false

		// 3  自动装箱，Float.valueOf(i), return new Float(f); 比较的是堆内存地址值。
		Float e4 = 129f;
		Float f4 = 129f;
		System.out.println(e4 == f4);// 输出 false
		// 4 比较时会自动拆箱，实质上是 g == h.floatValue()
		float g4 = 59.0f;
		Float h4 = new Float(59.0f);
		System.out.println(g4 == h4);// 输出 true
		System.out.println("float end -----------------");
		
		System.out.println("double start -----------------");
		//Double没有缓存。
		// 1  两个对象，比较的是堆内存地址值
		Double a5 = new Double(123);
		Double b5 = new Double(123);
		System.out.println(a5 == b5);// 输出 false

		// 2  自动装箱,Double.valueOf(i), return new Double(f); 比较的是堆内存地址值。
		Double c5 = 123d;
		Double d5 = 123d;
		System.out.println(c5 == d5);// 输出 false

		// 3  自动装箱，Double.valueOf(i), return new Double(f); 比较的是堆内存地址值。
		Double e5 = 129d;
		Double f5 = 129d;
		System.out.println(e5 == f5);// 输出 false
		// 4 比较时会自动拆箱，实质上是 g == h.doubleValue()
		double g5 = 59.0f;
		Double h5 = new Double(59.0d);
		System.out.println(g5 == h5);// 输出 true
		System.out.println("double end -----------------");
		
		System.out.println("char start -----------------");
		// char的范围是0~65535
		// char缓存区大小为 0 - 127，
		// 1  两个对象，比较的是堆内存地址值
		Character a6 = new Character((char) 123);
		Character b6 = new Character((char) 123);
		System.out.println(a6 == b6);// 输出 false

		// 2  自动装箱,Character.valueOf(i),并且数值范围在缓存区中，所以都取的是缓存区中的值。
		Character c6 = 123;
		Character d6 = 123;
		System.out.println(c6 == d6);// 输出 true

		// 3  自动装箱，Character.valueOf(i),并且数值范围不在缓存区中，都是new Character(i)，生成了新的对象，所以比较的是堆内存地址值。
		Character e6 = 129;
		Character f6 = 129;
		System.out.println(e6 == f6);// 输出 false
		// 4 比较时会自动拆箱，实质上是 g == h.charValue()
		char g6 = 59;
		Character h6 = new Character((char) 59);
		System.out.println(g6 == h6);// 输出 true
		
		System.out.println("char end -----------------");
	}

}
