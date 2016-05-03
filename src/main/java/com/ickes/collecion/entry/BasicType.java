package com.ickes.collecion.entry;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 基本类型跟String对象实现了comparator接口，所以能够直接进行排序
 * 
 * @author Ickes
 */
public class BasicType {
	public static void main(String[] args) {
		/**
		 * 原始数据类型排序
		 */
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(2);
		Collections.sort(list);
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("----String---");
		List<String> list1 = new ArrayList<>();
		list1.add("aaa");
		list1.add("fff");
		list1.add("bbb");
		list1.add("eee");
		list1.add("ccc");
		list1.add("ddd");
		//降序
		Collections.sort(list1,Collections.reverseOrder());
		for (String s : list1) {
			System.out.println(s);
		}
		
	}
}
