package com.myProfile.thyun.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProfile.thyun.Repository.HashtagJpaRepository;
import com.myProfile.thyun.Repository.HomeJpaRepository;
import com.myProfile.thyun.model.BlogHashtag;
import com.myProfile.thyun.model.BlogPost;

@Service
public class HomeSvc {
	@Autowired
	private HomeJpaRepository homeJpaRepository;
	@Autowired
	private HashtagJpaRepository hashtagJpaRepository;
	
	public List<BlogPost> findPostList(){
		return homeJpaRepository.findPostListNoDesc();
	}
	
	public List<BlogHashtag> findHashtagList() {		
		return hashtagJpaRepository.findHashtagList();
	}
}
