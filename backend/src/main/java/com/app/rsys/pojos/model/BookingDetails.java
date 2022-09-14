package com.app.rsys.pojos.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking_details")
public class BookingDetails extends BaseEntity {

	private String equipmentName;
	private int quantity;
	private double rentPerDay;
	private double discountOffer;
	private double finalRent;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="booking_id")
	private RentBooking rentBooking;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="equipment_id",nullable = true)
	private RentalEquipment rentalEquipment;

	public BookingDetails(String equipmentName, int quantity, double rentPerDay, double discountOffer,
			double finalRent) {
		super();
		this.equipmentName = equipmentName;
		this.quantity = quantity;
		this.rentPerDay = rentPerDay;
		this.discountOffer = discountOffer;
		this.finalRent = finalRent;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}

	public double getFinalRent() {
		return finalRent;
	}

	public void setFinalRent(double finalRent) {
		this.finalRent = finalRent;
	}

	public RentBooking getRentBooking() {
		return rentBooking;
	}

	public void setRentBooking(RentBooking rentBooking) {
		this.rentBooking = rentBooking;
	}

	public RentalEquipment getRentalEquipment() {
		return rentalEquipment;
	}

	public void setRentalEquipment(RentalEquipment rentalEquipment) {
		this.rentalEquipment = rentalEquipment;
	}

	@Override
	public String toString() {
		return "BookingDetails [equipmentName=" + equipmentName + ", quantity=" + quantity + ", rentPerDay="
				+ rentPerDay + ", discountOffer=" + discountOffer + ", finalRent=" + finalRent + ", getId()=" + getId()
				+ "]";
	}

	
	
	
}
