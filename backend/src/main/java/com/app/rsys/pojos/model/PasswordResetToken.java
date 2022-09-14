package com.app.rsys.pojos.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "payment_reset_token")
public class PasswordResetToken extends BaseEntity {

	private String tokenName;
	private LocalDate creationdate;
	private LocalTime tokenTime;
	private int userId;

	public PasswordResetToken() {
		// TODO Auto-generated constructor stub
	}

	public PasswordResetToken(String tokenName, LocalDate creationdate, LocalTime tokenTime, int userId) {
		super();
		this.tokenName = tokenName;
		this.creationdate = creationdate;
		this.tokenTime = tokenTime;
		this.userId = userId;
	}

	public String getTokenName() {
		return tokenName;
	}

	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}

	public LocalDate getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(LocalDate creationdate) {
		this.creationdate = creationdate;
	}

	public LocalTime getTokenTime() {
		return tokenTime;
	}

	public void setTokenTime(LocalTime tokenTime) {
		this.tokenTime = tokenTime;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "PasswordResetToken [tokenName=" + tokenName + ", creationdate=" + creationdate + ", tokenTime="
				+ tokenTime + ", userId=" + userId + "]";
	}

}
