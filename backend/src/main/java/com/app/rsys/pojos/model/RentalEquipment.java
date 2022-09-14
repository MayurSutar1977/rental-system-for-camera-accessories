package com.app.rsys.pojos.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="rental_equipment")
public class RentalEquipment extends BaseEntity{
    @Column(unique = true)
	private String equipmentName;
	
    private String brand;
	
    private int avlQuantity;
	
    private double rentPerDay;
	
    private double discountOffer;
	
    private double finalRent;
    @Column(length = 250,nullable = false)
    private String equipmentImage;
	@Column(length = 250)
    private String description;
	
    private LocalDate registrationDate;
	
    private LocalDate updatedDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="category_id")
	private Category category;

	@OneToOne(targetEntity = BookingDetails.class,mappedBy = "rentalEquipment")
	private BookingDetails bookingDetails;
	
	public RentalEquipment(String equipmentName, String brand, int avlQuantity, double rentPerDay, double discountOffer,
			double finalRent, String equipmentImage, String description, LocalDate registrationDate,
			LocalDate updatedDate, Category category) {
		super();
		this.equipmentName = equipmentName;
		this.brand = brand;
		this.avlQuantity = avlQuantity;
		this.rentPerDay = rentPerDay;
		this.discountOffer = discountOffer;
		this.finalRent = finalRent;
		this.equipmentImage = equipmentImage;
		this.description = description;
		this.registrationDate = registrationDate;
		this.updatedDate = updatedDate;
		this.category = category;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getAvlQuantity() {
		return avlQuantity;
	}

	public void setAvlQuantity(int avlQuantity) {
		this.avlQuantity = avlQuantity;
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

	public String getEquipmentImage() {
		return equipmentImage;
	}

	public void setEquipmentImage(String equipmentImage) {
		this.equipmentImage = equipmentImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "RentalEquipment [equipmentName=" + equipmentName + ", brand=" + brand + ", avlQuantity=" + avlQuantity
				+ ", rentPerDay=" + rentPerDay + ", discountOffer=" + discountOffer + ", finalRent=" + finalRent
				+ ", equipmentImage=" + equipmentImage + ", description=" + description + ", registrationDate="
				+ registrationDate + ", updatedDate=" + updatedDate + "]";
	}
	
	
}
