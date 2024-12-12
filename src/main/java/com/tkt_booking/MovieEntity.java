package com.tkt_booking;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class MovieEntity {
	@Column(name="movie_id")
	private int movieId;
	@Column(name="movie_title")
	private String movieTitle;
	@Column(name="duration")
	private LocalTime duration;
	@Column(name="rating")
	private String rating;
	@Column(name="release_date")
	private LocalDate releaseDate;
	@Column(name="audio_language")
	private String audioLanguage;
	
	@Column(name="created_by")
	private String createdBy;
	@Column(name="create_date")
	private String createdDate;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="modified_date")
	private String modifiedDate;
	
	
	public MovieEntity() {
		super();
	}
	
	public MovieEntity(int movieId, String movieTitle, LocalTime duration, String rating, LocalDate releaseDate,
			String audioLanguage, String createdBy, String createdDate, String modifiedBy, String modifiedDate) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.duration = duration;
		this.rating = rating;
		this.releaseDate = releaseDate;
		this.audioLanguage = audioLanguage;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public LocalTime getDuration() {
		return duration;
	}
	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getAudioLanguage() {
		return audioLanguage;
	}
	public void setAudioLanguage(String audioLanguage) {
		this.audioLanguage = audioLanguage;
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
