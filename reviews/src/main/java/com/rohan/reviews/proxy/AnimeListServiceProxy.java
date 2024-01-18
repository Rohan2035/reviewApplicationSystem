package com.rohan.reviews.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rohan.reviews.dto.AnimeInfoResponse;

@FeignClient(name = "anime-list")
public interface AnimeListServiceProxy {

	@GetMapping("anime-list/get-anime/{animeId}")
	public ResponseEntity<AnimeInfoResponse> fetchAnimeDetails(@PathVariable Integer animeId);

}
