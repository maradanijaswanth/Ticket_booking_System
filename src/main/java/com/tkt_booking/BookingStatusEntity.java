package com.tkt_booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="booking_status")
public class BookingStatusEntity {
	@Column(name="booking_status_id")
	private int bookingStatusId;
	@Column(name="booking_status_code")
	private String bookingStatusCode;
	@Column(name="description")
	private String description;
	@Column(name="display_name")
	private String displayName;
	
	@Column(name="created_by")
	private String createdBy;
	@Column(name="create_date")
	private String createdDate;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="modified_date")
	private String modifiedDate;
	
	
	public BookingStatusEntity() {
		super();
	}
	public BookingStatusEntity(int bookingStatusId, String bookingStatusCode, String description, String displayName,
			String createdBy, String createdDate, String modifiedBy, String modifiedDate) {
		super();
		this.bookingStatusId = bookingStatusId;
		this.bookingStatusCode = bookingStatusCode;
		this.description = description;
		this.displayName = displayName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}
	public int getBookingStatusId() {
		return bookingStatusId;
	}
	public void setBookingStatusId(int bookingStatusId) {
		this.bookingStatusId = bookingStatusId;
	}
	public String getBookingStatusCode() {
		return bookingStatusCode;
	}
	public void setBookingStatusCode(String bookingStatusCode) {
		this.bookingStatusCode = bookingStatusCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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
