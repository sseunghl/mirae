package com.sungjuk;

public class SysloginDto {
	public String userID;
	public String password;
	public String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SysloginDto() {}
	public SysloginDto(String userID,String password) {
		this.userID=userID;
		this.password=password;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
