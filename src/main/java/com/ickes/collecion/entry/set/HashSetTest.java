package com.ickes.collecion.entry.set;

import java.util.HashSet;
import java.util.Iterator;
/**
 * HashMap的key不能相等，他判断key是否相等，包括两个部分1、equals()相等；2、hashCode()相等；
 * 只有两个条件都满足，才是相等的。
 * <pre>
 * 		HashSet:底层使用HashMap实现，下面测试一个对象，如果内容相同，就认为是同一个对象。
 * </pre>
 * @author Ickes
 */
public class HashSetTest {
	public static void main(String[] args) {
		User user1 = new User(1,"ickes1","p1");
		User user5 = new User(5,"ickes5","p5");
		User user2 = new User(1,"ickes1","p1");
		User user4 = new User(4,"ickes4","p4");
		User user3 = new User(3,"ickes3","p3");
		HashSet<User> set = new HashSet<>();
		set.add(user1);
		set.add(user2);
		set.add(user3);
		set.add(user4);
		set.add(user5);
		Iterator<User> iterator= set.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			System.out.println(user.toString());
			
		}
	}
}
