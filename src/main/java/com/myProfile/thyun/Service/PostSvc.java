package com.myProfile.thyun.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProfile.thyun.Repository.HomeJpaRepository;
import com.myProfile.thyun.model.BlogHashtag;
import com.myProfile.thyun.model.BlogPost;
import com.myProfile.thyun.model.BlogPostHashtag;
import com.myProfile.thyun.model.BlogSubject;

@Service
public class PostSvc {
	@Autowired
	private HomeJpaRepository homeJpaRepository;
	
	public BlogPostHashtag findByPostUrlWithSubject(String postUrl){
		List<Object[]> resultList = homeJpaRepository.findByPostUrlWithSubject(postUrl);
		BlogPostHashtag bph = new BlogPostHashtag();
		bph.setPost(new BlogPost());
	
		//bph.getPost().setPostConts((resultList.get(0)[9]).toString()); 	//포스트내용
		
		bph.getPost().setSubject(new BlogSubject());
		bph.getPost().getSubject().setSubjectImgUrl(resultList.get(0)[2].toString());	//포스트이미지.
		bph.getPost().getSubject().setSubjectName(resultList.get(0)[0].toString());
		bph.setHashtag(new BlogHashtag());
		bph.getHashtag().setHashtagName(resultList.get(0)[1].toString()); //포스트 해시태그.
		
		BlogPost getPostConts = homeJpaRepository.findByPostUrl(postUrl);
		bph.getPost().setPostConts(getPostConts.getPostConts().toString()); 	//포스트내용
		return bph;
	}
	
	
}
