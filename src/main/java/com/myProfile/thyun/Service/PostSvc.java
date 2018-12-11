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
public class PostSvc {
	@Autowired
	private HomeJpaRepository homeJpaRepository;
	
	public BlogPostHashtag findByPostUrlWithSubject(String postUrl){
		List<Object[]> resultList = homeJpaRepository.findByPostUrlWithSubject(postUrl);
		BlogPostHashtag bph = new BlogPostHashtag();
		
		bph.setPost(new BlogPost());		
		bph.getPost().setSubject(new BlogSubject());
		bph.getPost().getSubject().setSubjectImgUrl(resultList.get(0)[2].toString());	//포스트 이미지.
		bph.getPost().getSubject().setSubjectImgStyle(resultList.get(0)[3].toString());	//포스트 이미지 스타일.
		bph.getPost().getSubject().setSubjectName(resultList.get(0)[0].toString());		//포스트 주제.
		bph.setHashtag(new BlogHashtag());
		bph.getHashtag().setHashtagName(resultList.get(0)[1].toString()); 				//포스트 해시태그.
		
		BlogPost getPostConts = homeJpaRepository.findByPostUrl(postUrl);
		bph.getPost().setPostSubtitle(getPostConts.getPostSubtitle().toString());		//포스트 서브타이틀.
		bph.getPost().setPostConts(getPostConts.getPostConts().toString()); 			//포스트 내용.
		return bph;
	}
	
	
}
