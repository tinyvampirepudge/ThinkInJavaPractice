package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

import java.util.ArrayList;
import java.util.List;

public class CloneTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clone1Class clone1Class = new Clone1Class();
		clone1Class.setCl("猫了个咪");
		List<Clone2Class> class2List = new ArrayList<>();
		for (int i = 0; i < 1; i++) {
			Clone2Class clone2Class = new Clone2Class();
			clone2Class.setC2("Clone1");
			List<Clone3Class> class3List = new ArrayList<>();
			for (int j = 0; j < 1; j++) {
				Clone3Class clone3Class = new Clone3Class();
				clone3Class.setName("Clone2");
				clone3Class.setSex(String.valueOf(j + 1));
				class3List.add(clone3Class);
			}
			clone2Class.setC3List(class3List);
			class2List.add(clone2Class);
		}
		clone1Class.setList2(getList2(1, 1, "Clone1", "Clone2"));
		clone1Class.setC2(get2(1, 1, "obj1", "obj1"));

		System.out.println(clone1Class);

		System.out.println("---------------------");
		Clone1Class clone1Class2 = clone1Class;
		System.out.println(clone1Class2);
		System.out.println(clone1Class.hashCode() == clone1Class2.hashCode());

		System.out.println("---------------------");
		Clone1Class clone1Class3 = (Clone1Class) clone1Class.clone();
		System.out.println(clone1Class3);
		System.out.println(clone1Class.hashCode() == clone1Class3.hashCode());

		/**
		 * 如下所示 clone1Class3的修改对clone1Class没有影响，这里实现了深度复制。
		 */
		System.out.println("---------------------");
		System.out.println("clone start");
		clone1Class3.setCl("clone1Class3 change");
		clone1Class3.setList2(getList2(1, 1, "change1", "change2"));
		clone1Class3.setC2(get2(1, 1, "c1", "c2"));
		System.out.println(clone1Class);
		System.out.println(clone1Class2);
		System.out.println(clone1Class3);
		System.out.println("clone end");
	}

	public static List<Clone2Class> getList2(int externalSize, int internalSize, String externalStr,
			String internalStr) {
		List<Clone2Class> class2List = new ArrayList<>();
		for (int i = 0; i < 1; i++) {
			Clone2Class clone2Class = new Clone2Class();
			clone2Class.setC2(externalStr);
			List<Clone3Class> class3List = new ArrayList<>();
			for (int j = 0; j < 1; j++) {
				Clone3Class clone3Class = new Clone3Class();
				clone3Class.setName(internalStr);
				clone3Class.setSex(String.valueOf(j + 1));
				class3List.add(clone3Class);
			}
			clone2Class.setC3List(class3List);
			class2List.add(clone2Class);
		}

		return class2List;
	}

	public static Clone2Class get2(int externalSize, int internalSize, String externalStr, String internalStr) {
		Clone2Class clone2Class = new Clone2Class();
		clone2Class.setC2(externalStr);
		List<Clone3Class> class3List = new ArrayList<>();
		for (int j = 0; j < 1; j++) {
			Clone3Class clone3Class = new Clone3Class();
			clone3Class.setName(internalStr);
			clone3Class.setSex(String.valueOf(j + 1));
			class3List.add(clone3Class);
		}
		clone2Class.setC3List(class3List);
		return clone2Class;
	}

}
