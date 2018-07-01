  package com.myProfile.thyun.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.myProfile.thyun.model.Artists;

@EnableJpaRepositories("com.myProfile.thyun.Repository") 
public interface WorldCupJpaRepository extends JpaRepository<Artists, String>{
	Artists findByArtistId(String artistId);
}
