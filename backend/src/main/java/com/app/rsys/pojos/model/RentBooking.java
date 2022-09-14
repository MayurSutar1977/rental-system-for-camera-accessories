package com.app.rsys.pojos.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.app.rsys.pojos.enums.BookingStatus;

@Entity
@Table(name = "rental_booking")
public class RentBooking extends BaseEntity {

	private LocalDate bookingDate;
	private LocalTime bookingTime;
	private double totalRent;
	private double securityDeposit;
	private double delayCharges;
	private BookingStatus bookingStatus;
	private double rentDay;
	private LocalDate rentDate;
	private LocalTime rentTime;
	private LocalDate receivedDate;
	private LocalTime receivedTime;

	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(targetEntity = BookingDetails.class,mappedBy = "rentBooking")
	private BookingDetails bookingdetails;
	
	
//	@OneToOne(targetEntity = Payment.class,mappedBy = "rentBooking")
//	private Payment payment;
	
	public RentBooking(LocalDate bookingDate, LocalTime bookingTime, double totalRent, double securityDeposit,
			double delayCharges, BookingStatus bookingStatus, double rentDay, LocalDate rentDate, LocalTime rentTime,
			LocalDate receivedDate, LocalTime receivedTime, User user) {
		super();
		this.bookingDate = bookingDate;
		this.bookingTime = bookingTime;
		this.totalRent = totalRent;
		this.securityDeposit = securityDeposit;
		this.delayCharges = delayCharges;

		this.rentDay = rentDay;
		this.rentDate = rentDate;
		this.rentTime = rentTime;

	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public double getTotalRent() {
		return totalRent;
	}

	public void setTotalRent(double totalRent) {
		this.totalRent = totalRent;
	}

	public double getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public double getDelayCharges() {
		return delayCharges;
	}

	public void setDelayCharges(double delayCharges) {
		this.delayCharges = delayCharges;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public double getRentDay() {
		return rentDay;
	}

	public void setRentDay(double rentDay) {
		this.rentDay = rentDay;
	}

	public LocalDate getRentDate() {
		return rentDate;
	}

	public void setRentDate(LocalDate rentDate) {
		this.rentDate = rentDate;
	}

	public LocalTime getRentTime() {
		return rentTime;
	}

	public void setRentTime(LocalTime rentTime) {
		this.rentTime = rentTime;
	}

	public LocalDate getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(LocalDate receivedDate) {
		this.receivedDate = receivedDate;
	}

	public LocalTime getReceivedTime() {
		return receivedTime;
	}

	public void setReceivedTime(LocalTime receivedTime) {
		this.receivedTime = receivedTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "RentBooking [bookingDate=" + bookingDate + ", bookingTime=" + bookingTime + ", totalRent=" + totalRent
				+ ", securityDeposit=" + securityDeposit + ", delayCharges=" + delayCharges + ", bookingStatus="
				+ bookingStatus + ", rentDay=" + rentDay + ", rentDate=" + rentDate + ", rentTime=" + rentTime + "]";
	}

	

}
