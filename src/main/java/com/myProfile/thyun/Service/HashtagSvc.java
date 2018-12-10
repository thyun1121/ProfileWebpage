package com.myProfile.thyun.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProfile.thyun.Repository.HomeJpaRepository;
import com.myProfile.thyun.model.BlogHashtag;
import com.myProfile.thyun.model.BlogPost;
import com.myProfile.thyun.model.BlogPostHashtag;
import com.myProfile.thyun.model.BlogSubject;

@Service
public class HashtagSvc {
	@Autowired
	private HomeJpaRepository homeJpaRepository;
	
	public List<BlogPost> findPostsByHashtagName(String tagName){
		return homeJpaRepository.findPostsByHashtagName(tagName);
	}
	
	
}
