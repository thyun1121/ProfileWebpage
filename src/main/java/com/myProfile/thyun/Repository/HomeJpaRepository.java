  package com.myProfile.thyun.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.myProfile.thyun.model.BlogPost;

@EnableJpaRepositories("com.myProfile.thyun.Repository") 
public interface HomeJpaRepository extends JpaRepository<BlogPost, String>{
}
