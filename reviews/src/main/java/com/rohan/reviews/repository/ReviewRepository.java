package com.rohan.reviews.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohan.reviews.entities.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {

	public List<Review> findAllByAnimeId(int animeId);

}
