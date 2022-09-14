package com.app.rsys.pojos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="category")
public class Category extends BaseEntity {
	
	@Column(name="category_name",length=20,nullable=false)
	private String categoryName;
	@Column(length=200,nullable=true)
	private String categoryImage;
	
	@OneToMany(targetEntity = RentalEquipment.class,mappedBy = "category")
	private RentalEquipment rentalEquipment;
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryImage() {
		return categoryImage;
	}
	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}

	
}
