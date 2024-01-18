package com.rohan.reviews.dto;

import java.util.List;

import com.rohan.reviews.entities.Review;

public class ReviewResponse {

	private AnimeInfo animeInfo;

	private List<Review> reviews;

	private Integer animeListServicePort;

	public AnimeInfo getAnimeInfo() {
		return animeInfo;
	}

	public void setAnimeInfo(AnimeInfo animeInfo) {
		this.animeInfo = animeInfo;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Integer getAnimeListServicePort() {
		return animeListServicePort;
	}

	public void setAnimeListServicePort(Integer animeListServicePort) {
		this.animeListServicePort = animeListServicePort;
	}

}
