package com.myProfile.thyun.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProfile.thyun.Repository.HomeJpaRepository;
import com.myProfile.thyun.model.BlogPost;

@Service
public class PostSvc {
	@Autowired
	private HomeJpaRepository homeJpaRepository;
	
	public BlogPost findByPostUrl(String postUrl){
		return homeJpaRepository.findByPostUrl(postUrl);
	}
}
