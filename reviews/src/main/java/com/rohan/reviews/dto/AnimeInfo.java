package com.rohan.reviews.dto;


public class AnimeInfo {
	
	private Integer animeId;
	private String animeName;
	private String category;
	private String completionStatus;
	private Double episodeNo;
	private String author;

	public AnimeInfo() {
		super();
	}

	public AnimeInfo(Integer animeId, String animeName, String category, String completionStatus, Double episodeNo,
			String author) {
		super();
		this.animeId = animeId;
		this.animeName = animeName;
		this.category = category;
		this.completionStatus = completionStatus;
		this.episodeNo = episodeNo;
		this.author = author;
	}

	public Integer getAnimeId() {
		return animeId;
	}

	public void setAnimeId(Integer animeId) {
		this.animeId = animeId;
	}

	public String getAnimeName() {
		return animeName;
	}

	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCompletionStatus() {
		return completionStatus;
	}

	public void setCompletionStatus(String completionStatus) {
		this.completionStatus = completionStatus;
	}

	public Double getEpisodeNo() {
		return episodeNo;
	}

	public void setEpisodeNo(Double episodeNo) {
		this.episodeNo = episodeNo;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
