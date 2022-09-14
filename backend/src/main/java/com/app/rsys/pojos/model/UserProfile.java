package com.app.rsys.pojos.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name= "user_profile")
public class UserProfile  {

@NotNull	
@Column(name="first_name",nullable = false ,length=30)
private String firstname;

@NotNull
@Column(name="last_name",length=30,nullable=false)
private String lastName;

@NotNull
@Column(length=30,unique=true)
private int idNumber;

private String profileImage;

private LocalDate dateOfBirth;
@NotNull
@Column(length=30,unique = true,nullable = false)
private String email;

@Column(name="contact_number", length=10,nullable=true)
private long phoneNumber;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="user_id",nullable=true)
private User user;

@OneToOne(targetEntity = UserAddress.class,mappedBy ="userProfile")
private UserAddress userAddress;



public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getIdNumber() {
	return idNumber;
}

public void setIdNumber(int idNumber) {
	this.idNumber = idNumber;
}

public String getProfileImage() {
	return profileImage;
}

public void setProfileImage(String profileImage) {
	this.profileImage = profileImage;
}

public LocalDate getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public UserAddress getUserAddress() {
	return userAddress;
}

public void setUserAddress(UserAddress userAddress) {
	this.userAddress = userAddress;
}

@Override
public String toString() {
	return "UserProfile [firstname=" + firstname + ", lastName=" + lastName + ", idNumber=" + idNumber
			+ ", profileImage=" + profileImage + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", phoneNumber="
			+ phoneNumber + ", user=" + user + ", userAddress=" + userAddress + "]";
}


}
