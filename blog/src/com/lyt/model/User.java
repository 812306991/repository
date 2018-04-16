package com.lyt.model;

public class User {
	private int id;
	private String userName;
	private String password;
	
	public User(){
		super();
	}
	public User(int id,String userName,String password){
		this.id=id;
		this.userName=userName;
		this.password=password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
	

}
