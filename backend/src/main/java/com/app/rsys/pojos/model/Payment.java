package com.app.rsys.pojos.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.app.rsys.pojos.enums.Currency;
import com.app.rsys.pojos.enums.PaymentGateway;
import com.app.rsys.pojos.enums.PaymentStatus;

@Entity
@Table(name="payment")
public class Payment extends BaseEntity{

	private String chargesId;
	private LocalDate paymentDate;
	
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
	
	@Enumerated(EnumType.STRING)
	private Currency currency;
	
	private double amount;
	
	@Enumerated(EnumType.STRING)
	private PaymentGateway paymentGateway;
	
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="booking_id")
	private RentBooking rentBooking;

	public Payment(String chargesId, LocalDate paymentDate, PaymentStatus paymentStatus, Currency currency,
			double amount, PaymentGateway paymentGateway) {
		super();
		this.chargesId = chargesId;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
		this.currency = currency;
		this.amount = amount;
		this.paymentGateway = paymentGateway;
	}

	public String getChargesId() {
		return chargesId;
	}

	public void setChargesId(String chargesId) {
		this.chargesId = chargesId;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public PaymentGateway getPaymentGateway() {
		return paymentGateway;
	}

	public void setPaymentGateway(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public RentBooking getRentBooking() {
		return rentBooking;
	}

	public void setRentBooking(RentBooking rentBooking) {
		this.rentBooking = rentBooking;
	}

	@Override
	public String toString() {
		return "Payment [chargesId=" + chargesId + ", paymentDate=" + paymentDate + ", paymentStatus=" + paymentStatus
				+ ", currency=" + currency + ", amount=" + amount + ", paymentGateway=" + paymentGateway + ", getId()="
				+ getId() + "]";
	}

	
	
}
