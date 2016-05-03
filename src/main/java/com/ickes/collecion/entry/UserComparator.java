package com.ickes.collecion.entry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 外部排序
 * 
 * @author Ickes
 *
 * @param <T>
 */
public class UserComparator implements Comparator<User> {

	/**
	 * 进行整体排序所需要的比较逻辑,这里用id进行逻辑比较
	 * 
	 * <pre>
	 * 	this < obj 返回负 
	 * 	this = obj 返回 0 
	 * 	this > obj 返回正
	 * </pre>
	 */
	@Override
	public int compare(User o1, User o2) {
		return o1.getUserId() - o2.getUserId();
	}

	/**
	 * 测试
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		User user1 = new User(1, "ickes1", 1F);
		User user2 = new User(2, "ickes2", 2F);
		User user3 = new User(3, "ickes3", 3F);
		User user4 = new User(4, "ickes4", 4F);
		User user5 = new User(5, "ickes5", 5F);

		List<User> list = new ArrayList<>();
		list.add(user1);
		list.add(user5);
		list.add(user2);
		list.add(user4);
		list.add(user3);
		// 顺序排序
		Collections.sort(list,new UserComparator());
		for (User user : list) {
			System.out.println(user.toString());
		}
		System.out.println("------------------");
		Collections.shuffle(list);
		// 逆序排序
		Collections.sort(list,Collections.reverseOrder(new UserComparator()));
		for (User user : list) {
			System.out.println(user.toString());
		}
	}
}
