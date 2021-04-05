package com.wolken.wolkenapp;

import com.wolken.wolkenapp.dto.ElectronicProductsDTO;

public class ElectronicTester {
	
	public static void main(String[] args) {
		ElectronicProductsDTO dto =  new ElectronicProductsDTO();
		 dto.setPrice(2000.0);
		 dto.setProductId(32);
		 dto.setProductName("mixer");
		 dto.setRatings(3.0);
		 dto.setType("Home Appliances");
		 
		 ElectronicProductsDTO dto1 =  new ElectronicProductsDTO();
		 dto1.setPrice(2000.0);
		 dto1.setProductId(123);
		 dto1.setProductName("mixer");
		 dto1.setRatings(3.0);
		 dto1.setType("Home Appliances");
		 
		 System.out.println(dto); //instead of writing syso printing statement we can print ref variable and override
		  System.out.println(dto.hashcode());
	      System.out.println(dto1.hashcode());
        System.out.println(dto.equals(dto1));  
          
	}
}
