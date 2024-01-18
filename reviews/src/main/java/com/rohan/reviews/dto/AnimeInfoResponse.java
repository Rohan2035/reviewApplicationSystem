package com.rohan.reviews.dto;

public class AnimeInfoResponse {

	private Integer port;
	private AnimeInfo animeInfo;

	public AnimeInfoResponse() {
		super();
	}

	public AnimeInfoResponse(Integer port, AnimeInfo animeInfo) {
		super();
		this.port = port;
		this.animeInfo = animeInfo;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public AnimeInfo getAnimeInfo() {
		return animeInfo;
	}

	public void setAnimeInfo(AnimeInfo animeInfo) {
		this.animeInfo = animeInfo;
	}

}
