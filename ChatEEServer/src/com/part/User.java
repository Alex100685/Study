package com.part;

public class User {
	
	String password;
	long beaconTime;
	String status;
	
	User (String password, long beaconTime){
		this.password = password;
		this.beaconTime = beaconTime;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getBeaconTime() {
		return beaconTime;
	}

	public void setBeaconTime(long beaconTime) {
		this.beaconTime = beaconTime;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
