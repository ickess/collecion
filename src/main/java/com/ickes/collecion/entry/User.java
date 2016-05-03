package com.ickes.collecion.entry;

/**
 * 普通实体
 * @author Ickes
 */
public class User{

	private Integer userId;
	private String userName;
	private Float sal;

	public User(Integer userId, String userName, Float sal) {
		this.userId = userId;
		this.userName = userName;
		this.sal = sal;
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
		return "User [userId=" + userId + ", userName=" + userName + ", sal=" + sal + "]";
	}
}
