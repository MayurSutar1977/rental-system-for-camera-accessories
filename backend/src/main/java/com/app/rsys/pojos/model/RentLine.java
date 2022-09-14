package com.app.rsys.pojos.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rent_line")
public class RentLine extends BaseEntity {
	@Column(name = "user_id", nullable = false)
	private int userId;
	@Column(unique = true, nullable = false)
	private String equipmentName;

	private String brand;

	private int quantity;
	private double delayCharges;
	private double rentPerDay;

	private double discountOffer;

	private double finalRent;
	@Column(length = 250, nullable = false)
	private String equipmentImage;
	@Column(length = 250, nullable = false)
	private String description;

	private String categoryName;

	public RentLine(int userId, String equipmentName, String brand, int quantity, double delayCharges,
			double rentPerDay, double discountOffer, double finalRent, String equipmentImage, String description,
			String categoryName) {
		super();
		this.userId = userId;
		this.equipmentName = equipmentName;
		this.brand = brand;
		this.quantity = quantity;
		this.delayCharges = delayCharges;
		this.rentPerDay = rentPerDay;
		this.discountOffer = discountOffer;
		this.finalRent = finalRent;
		this.equipmentImage = equipmentImage;
		this.description = description;
		this.categoryName = categoryName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getDelayCharges() {
		return delayCharges;
	}

	public void setDelayCharges(double delayCharges) {
		this.delayCharges = delayCharges;
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

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "RentLine [userId=" + userId + ", equipmentName=" + equipmentName + ", brand=" + brand + ", quantity="
				+ quantity + ", delayCharges=" + delayCharges + ", rentPerDay=" + rentPerDay + ", discountOffer="
				+ discountOffer + ", finalRent=" + finalRent + ", equipmentImage=" + equipmentImage + ", description="
				+ description + ", categoryName=" + categoryName + "]";
	}
	
	

}
