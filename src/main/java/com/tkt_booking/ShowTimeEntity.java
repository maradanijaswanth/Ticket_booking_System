package com.tkt_booking;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="show_time")
public class ShowTimeEntity {
	@Column(name="show_time_id")
	private int showTimeId;
	@Column(name="screen_id")
	private int screenId;
	@Column(name="show_time")
	private LocalTime showTime;
	@Column(name="is_active")
	private boolean isActive;
	@Column(name="current_movie_id")
	private int currentMovieId;
	
	@Column(name="created_by")
	private String createdBy;
	@Column(name="create_date")
	private String createdDate;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="modified_date")
	private String modifiedDate;
	
	
	public ShowTimeEntity() {
		super();
	}


	public ShowTimeEntity(int showTimeId, int screenId, LocalTime showTime, boolean isActive, int currentMovieId,
			String createdBy, String createdDate, String modifiedBy, String modifiedDate) {
		super();
		this.showTimeId = showTimeId;
		this.screenId = screenId;
		this.showTime = showTime;
		this.isActive = isActive;
		this.currentMovieId = currentMovieId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}


	public int getShowTimeId() {
		return showTimeId;
	}


	public void setShowTimeId(int showTimeId) {
		this.showTimeId = showTimeId;
	}


	public int getScreenId() {
		return screenId;
	}


	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}


	public LocalTime getShowTime() {
		return showTime;
	}


	public void setShowTime(LocalTime showTime) {
		this.showTime = showTime;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public int getCurrentMovieId() {
		return currentMovieId;
	}


	public void setCurrentMovieId(int currentMovieId) {
		this.currentMovieId = currentMovieId;
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
