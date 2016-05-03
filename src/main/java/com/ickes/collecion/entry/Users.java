package com.ickes.collecion.entry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 实现Comparable接口的自然排序；我叫他内部排序
 * 
 * @author Ickes
 *
 */
public class Users implements Comparable<Users> {

	private Integer userId;
	private String userName;
	private Float sal;

	public Users(Integer userId, String userName, Float sal) {
		this.userId = userId;
		this.userName = userName;
		this.sal = sal;
	}

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
	public int compareTo(Users user) {
		return this.getUserId() - user.getUserId();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Float getSal() {
		return sal;
	}

	public void setSal(Float sal) {
		this.sal = sal;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", sal=" + sal + "]";
	}

	/**
	 * 测试
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Users> list = new ArrayList<>();
		Users user0 = new Users(1, "ickes1", 12F);
		Users user1 = new Users(2, "ickes2", 12F);
		Users user2 = new Users(3, "ickes3", 12F);
		Users user3 = new Users(4, "ickes4", 12F);
		Users user4 = new Users(5, "ickes5", 12F);

		list.add(user0);
		list.add(user4);
		list.add(user1);
		list.add(user3);
		list.add(user2);

		// 顺序排列
		Collections.sort(list);
		for (Users u : list) {
			System.out.println(u.toString());
		}
		System.out.println("--------------");
		Collections.shuffle(list);
		// 逆序
		Collections.sort(list, Collections.reverseOrder());
		for (Users u : list) {
			System.out.println(u.toString());
		}
	}
}
