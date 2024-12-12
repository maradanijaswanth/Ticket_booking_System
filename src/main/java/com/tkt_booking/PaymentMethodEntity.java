package com.tkt_booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="payment_method")
public class PaymentMethodEntity {
	@Column(name="payment_method_id")
	private int paymentMethodId;
	@Column(name="payment_method_name")
	private String paymentMethodName;
	
	@Column(name="created_by")
	private String createdBy;
	@Column(name="create_date")
	private String createdDate;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="modified_date")
	private String modifiedDate;
	
	
	public PaymentMethodEntity() {
		super();
	}


	public PaymentMethodEntity(int paymentMethodId, String paymentMethodName, String createdBy, String createdDate,
			String modifiedBy, String modifiedDate) {
		super();
		this.paymentMethodId = paymentMethodId;
		this.paymentMethodName = paymentMethodName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}


	public int getPaymentMethodId() {
		return paymentMethodId;
	}


	public void setPaymentMethodId(int paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}


	public String getPaymentMethodName() {
		return paymentMethodName;
	}


	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}


	public String getModifiedBy() {
		return modifiedBy;
	}


	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}


	public String getModifiedDate() {
		return modifiedDate;
	}


	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	
	
	

}
