
package com.app.rsys.pojos.model;

import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.app.rsys.pojos.enums.UserRole;

@Entity
@Table(name = "user_account")
public class User extends BaseEntity {

	@NotNull
	@Column(name = "user_name", length = 30, unique = true, nullable = false)
	private String userName;

	@NotNull
	@Column(name = "password", length = 120, nullable = false)
	private String password;

	@Transient
	private String confirmPassword;

	private LocalDate registrationDate;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false/* , columnDefinition = "varchar(10) default 'CUSTOMER'" */)
	private UserRole userRole = UserRole.CUSTOMER;

	@OneToOne(targetEntity = UserProfile.class, mappedBy = "user")
	private UserProfile userProfile;

	@OneToMany(targetEntity = RentBooking.class,mappedBy = "user")
	private RentBooking rentBooking;
	
//	@OneToOne(targetEntity = Payment.class,mappedBy = "user")
//	private Payment payment;
//	
	public User() {

		
	}

	public User(@NotNull String userName, @NotNull String password, @NotNull String confirmPassword, UserRole userRole,
			LocalDate registrationDate) {
		super();
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.userRole = userRole;
		this.registrationDate = registrationDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", userRole=" + userRole + ", getId()=" + getId() + "]";
	}

}
