package com.tinytongtong.thinkinjavapractice.chapter11.part03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *Arrays.asList()方法的限制是它对所产生的List的类型做出了最理想的假设。
 * @author huaying
 *
 */
public class AsListInference {

	public static void main(String[] args) {
		List<Snow> snow = Arrays.asList(new Crusty(),new Slush(),new Powder());
		
		//书上说不会编译，可是这里没问题啊，问号脸。
		// 是不会编译。。。。。。
//		List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());
		
		//Collections.addAll()方法不会被拒绝。
		List<Snow> snow3 = new ArrayList<>();
		Collections.addAll(snow3, new Light(),new Heavy());
		
	}

}

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
