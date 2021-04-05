package com.wolken.wolkenapp.dto;
import com.wolken.wolkenapp.dto.ElectronicProductsDTO;
public class ElectronicProductsDTO {
	// To make it completely object oriented 
	/*
	 * private Integer productId;
	 *  private String productName;
	 *   private Double price;
	 * private String type; 
	 * private Double ratings;
	 */
	private int productId;
	private String productName;
	private double price;
	private String type;
	private double ratings;
	
	public ElectronicProductsDTO() {
		//TODO auto generated constructor
		System.out.println(this.getClass());
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getRatings() {
		return ratings;
	}
	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}
	
	@Override
	public String toString() {
		return "ElectronicProductsDTO - productId=" +productId+" , ProductName="  +productName+", Price=" +price+" , Type=" +type+", Ratings=" +ratings;// we can | instead of comma
	}
	public int hashcode() {
		return productId;
	} 
	public boolean equals(Object obj) {
		//down casting
		ElectronicProductsDTO dto = (ElectronicProductsDTO)obj;
		if(obj == null) {
			return false;
		}
		else
		{
			if(obj instanceof ElectronicProductsDTO) {
				if(this.hashcode() == dto.hashCode()) {  // can also use obj.hashCode
					return true;
				}
				if(this.price == (dto.price)) {
					return true;
				}
			}
		}		
	
	return false;
}
}
