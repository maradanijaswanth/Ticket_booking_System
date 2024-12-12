package com.tkt_booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="seats")
public class SeatEntity {
	@Column(name="seat_id")
	private int seatId;
	@Column(name="screen_id")
	private int screenId;
	@Column(name="seat_number")
	private int seatNumber;
	
	@Column(name="created_by")
	private String createdBy;
	@Column(name="create_date")
	private String createdDate;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="modified_date")
	private String modifiedDate;
	
	
	public SeatEntity() {
		super();
	}


	public SeatEntity(int seatId, int screenId, int seatNumber, String createdBy, String createdDate, String modifiedBy,
			String modifiedDate) {
		super();
		this.seatId = seatId;
		this.screenId = screenId;
		this.seatNumber = seatNumber;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}


	public int getSeatId() {
		return seatId;
	}


	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}


	public int getScreenId() {
		return screenId;
	}


	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}


	public int getSeatNumber() {
		return seatNumber;
	}


	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
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