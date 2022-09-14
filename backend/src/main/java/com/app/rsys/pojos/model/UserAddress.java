package com.app.rsys.pojos.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

public class UserAddress {
    
	@Column(length=20)
	private String homeNumber;
	
	@Column(length=20)
	private String society;
	
	@Column(length=20,nullable=false)
	private String area;
	
	@Column(length=20,nullable=false)
	private String city;
	
	@Column(length=20,nullable=false)
	private String state;
	
	@NotNull
	private int pinCode;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="profile_id" ,nullable=true)
	private UserProfile userProfile;

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Override
	public String toString() {
		return "UserAddress [homeNumber=" + homeNumber + ", society=" + society + ", area=" + area + ", city=" + city
				+ ", state=" + state + ", pinCode=" + pinCode + ", userProfile=" + userProfile + "]";
	}
	
	
	
}
