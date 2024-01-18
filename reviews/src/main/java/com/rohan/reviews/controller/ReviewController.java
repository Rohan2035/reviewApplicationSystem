package com.rohan.reviews.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rohan.reviews.dto.AnimeInfoResponse;
import com.rohan.reviews.dto.ReviewResponse;
import com.rohan.reviews.entities.Review;
import com.rohan.reviews.proxy.AnimeListServiceProxy;
import com.rohan.reviews.repository.ReviewRepository;

@RestController
public class ReviewController {

	@Autowired
	private AnimeListServiceProxy animeListServiceProxy;

	@Autowired
	private ReviewRepository reviewRepository;

	@GetMapping("reviews-feign/get-review/{animeId}")
	public ReviewResponse getReview(@PathVariable int animeId) {

		List<Review> reviewList = reviewRepository.findAllByAnimeId(animeId);

		Map<String, Integer> uriVariables = new HashMap<>();
		uriVariables.put("animeId", animeId);

		ResponseEntity<AnimeInfoResponse> animeInfoResponseEntity = animeListServiceProxy.fetchAnimeDetails(animeId);
		AnimeInfoResponse animeInfoResponse = animeInfoResponseEntity.getBody();

		ReviewResponse reviewResponse = new ReviewResponse();
		reviewResponse.setAnimeInfo(animeInfoResponse.getAnimeInfo());
		reviewResponse.setReviews(reviewList);
		reviewResponse.setAnimeListServicePort(animeInfoResponse.getPort());

		return reviewResponse;

	}

	@PostMapping("reviews/add-review")
	public Map<String, String> addReview(@RequestBody Review review) {

		reviewRepository.save(review);

		Map<String, String> responseMessage = new HashMap<>();
		responseMessage.put("Message", "Data Successfully Added");

		return responseMessage;

	}

}
