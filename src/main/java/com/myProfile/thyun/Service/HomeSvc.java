package com.myProfile.thyun.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProfile.thyun.Repository.HomeJpaRepository;
import com.myProfile.thyun.Repository.WorldCupJpaRepository;
import com.myProfile.thyun.model.BlogPost;

@Service
public class HomeSvc {
	@Autowired
	private HomeJpaRepository homeJpaRepository;
	
	public List<BlogPost> posts(){
		return homeJpaRepository.findAll();
	}
}
