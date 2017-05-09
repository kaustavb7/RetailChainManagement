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
	private String productPrice;
	private String productRating;
	private String productStatus;
	private String productStartTime;
	private String productEndTime;
	
	public RetailInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RetailInfo(int retailId, String productName, String productPrice, String productRating, String productStatus,
			String productStartTime, String productEndTime) {
		super();
		this.retailId = retailId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productRating = productRating;
		this.productStatus = productStatus;
		this.productStartTime = productStartTime;
		this.productEndTime = productEndTime;
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

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductRating() {
		return productRating;
	}

	public void setProductRating(String productRating) {
		this.productRating = productRating;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductStartTime() {
		return productStartTime;
	}

	public void setProductStartTime(String productStartTime) {
		this.productStartTime = productStartTime;
	}

	public String getProductEndTime() {
		return productEndTime;
	}

	public void setProductEndTime(String productEndTime) {
		this.productEndTime = productEndTime;
	}
	
	
	
	
}
