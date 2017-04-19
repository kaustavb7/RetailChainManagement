package com.retail.info.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="retail_info")
public class RetailInfo {
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int retailId;
	private String productName;
	private int productPrice;
	
	public RetailInfo(int retailId, String productName, int productPrice) {
		super();
		this.retailId = retailId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	public RetailInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getRetailId() {
		return retailId;
	}
	public void setRetailId(int retailId) {
		this.retailId = retailId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	} 

}
