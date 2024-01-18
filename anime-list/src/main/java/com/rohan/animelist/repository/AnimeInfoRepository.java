package com.rohan.animelist.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohan.animelist.entities.AnimeInfo;

@Repository
public interface AnimeInfoRepository extends JpaRepository<AnimeInfo, Integer> {
	
	public Optional<AnimeInfo> findById(Integer animeId);

}
