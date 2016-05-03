package com.ickes.collecion.entry.set;


import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet测试,TreeSet的特点除了可以不重复，还会排序，所以就有了equals，hashCode,comparable
 * <pre>
 * 		equals，hashCode方法是为了比较对象是不是相等；
 * 		comparable是为了排序；
 * <pre>
 * @author Ickes
 *
 */
public class TreeSetTest {
	public static void main(String[] args) {
		User user1 = new User(1,"ickes1","p1");
		User user5 = new User(5,"ickes5","p5");
		User user2 = new User(1,"ickes1","p1");
		User user4 = new User(4,"ickes4","p4");
		User user3 = new User(3,"ickes3","p3");
		TreeSet<User> set = new TreeSet<>();
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
