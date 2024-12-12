package com.tkt_booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class BookingEntity {
	@Column(name="booking_id")
	private int bookingId;
	@Column(name="booking_number")
	private String bookingNumber;
	@Column(name="user_id")
	private int userId;
	@Column(name="movie_id")
	private int movieId;
	@Column(name="show_time_id")
	private int showTimeId;
	@Column(name="screen_id")
	private int screenId;
	@Column(name="seat_id")
	private int seatId;
	@Column(name="booking_status_id")
	private int bookingStatusId;
	
	@Column(name="created_by")
	private String createdBy;
	@Column(name="create_date")
	private String createdDate;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="modified_date")
	private String modifiedDate;
	
	
	public BookingEntity() {
		super();
	}
	
	public BookingEntity(int bookingId, String bookingNumber, int userId, int movieId, int showTimeId, int screenId,
			int seatId, int bookingStatusId, String createdBy, String createdDate, String modifiedBy,
			String modifiedDate) {
		super();
		this.bookingId = bookingId;
		this.bookingNumber = bookingNumber;
		this.userId = userId;
		this.movieId = movieId;
		this.showTimeId = showTimeId;
		this.screenId = screenId;
		this.seatId = seatId;
		this.bookingStatusId = bookingStatusId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
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
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public int getBookingStatusId() {
		return bookingStatusId;
	}
	public void setBookingStatusId(int bookingStatusId) {
		this.bookingStatusId = bookingStatusId;
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
	public void setCreatedDate(String createDate) {
		this.createdDate = createDate;
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
