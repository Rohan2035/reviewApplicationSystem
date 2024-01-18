package com.rohan.animelist.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rohan.animelist.dto.AnimeInfoResponse;
import com.rohan.animelist.entities.AnimeInfo;
import com.rohan.animelist.repository.AnimeInfoRepository;

@RestController
public class AnimeListController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private AnimeInfoRepository animeInfoRepository;

	@GetMapping("anime-list/get-anime/{animeId}")
	public AnimeInfoResponse fetchAnimeDetails(@PathVariable Integer animeId) {
		
		AnimeInfo animeInfo = animeInfoRepository.findById(animeId).get();
		Integer portNumber = Integer.parseInt(environment.getProperty("local.server.port"));
		
		return new AnimeInfoResponse(portNumber, animeInfo);

	}
	
	@PostMapping("anime-list/add-a-anime/")
	public Map<String, String> addAnime(@RequestBody AnimeInfo animeInfo) {
		
		animeInfoRepository.save(animeInfo);
		
		Map<String, String> messageMap = new HashMap<>();
		messageMap.put("Status", "Successfully Added");
		
		return messageMap;
		
	}

}
