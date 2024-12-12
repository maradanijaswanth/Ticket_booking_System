package com.tkt_booking;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class TransactionEntity {
	@Column(name="txn_id")
	private int txnId;
	@Column(name="txn_date")
	private LocalDate txnDate;
	@Column(name="booking_number")
	private String bookingNumber;
	@Column(name="txn_amount")
	private double txnAmount;
	@Column(name="txn_status")
	private String txnStatus;
	@Column(name="payment_method_id")
	private int paymentMethodId;
	
	
	@Column(name="created_by")
	private String createdBy;
	@Column(name="create_date")
	private String createdDate;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="modified_date")
	private String modifiedDate;
	
	public TransactionEntity() {
		super();
	}
	

	public TransactionEntity(int txnId, LocalDate txnDate, String bookingNumber, double txnAmount, String txnStatus,
			int paymentMethodId, String createdBy, String createdDate, String modifiedBy, String modifiedDate) {
		super();
		this.txnId = txnId;
		this.txnDate = txnDate;
		this.bookingNumber = bookingNumber;
		this.txnAmount = txnAmount;
		this.txnStatus = txnStatus;
		this.paymentMethodId = paymentMethodId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}


	public int getTxnId() {
		return txnId;
	}

	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}

	public LocalDate getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}

	public String getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public double getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(double txnAmount) {
		this.txnAmount = txnAmount;
	}

	public String getTxnStatus() {
		return txnStatus;
	}

	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}

	public int getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(int paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
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
