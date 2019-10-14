package com.ivet.whatineed.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "stufftable")
public class Whatineed implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Whatineed() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //GenerationType.Identity es para codificar de una manera el Id que le viene bien a MySQL
	private Long id;
	
	private String name;
	
	private String color;
	
	private Double price;
	
	private Long quantity;

	public Whatineed(Long id, String name, String color, Double price, Long quantity) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
			
}
