  package com.myProfile.thyun.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.myProfile.thyun.model.BlogHashtag;
import com.myProfile.thyun.model.BlogPost;
import com.myProfile.thyun.model.BlogPostHashtag;

@EnableJpaRepositories("com.myProfile.thyun.Repository") 
//https://jdm.kr/blog/121  참고.
public interface HashtagJpaRepository extends JpaRepository<BlogHashtag, String>{
	
	@Query("SELECT B.hashtagNo\n" + 
			"        ,B.hashtagName\n" + 
			"        ,COUNT(C.postNo) AS postNo\n" + 
			"FROM BlogPostHashtag A\n" + 
			"    JOIN A.hashtag B\n" +
			"    JOIN A.post C\n" +
			"GROUP BY B.hashtagNo\n" + 
			"        ,B.hashtagName\n" + 
			"ORDER BY COUNT(C.postNo) DESC ")
	List<BlogHashtag> findHashtagList();
	
}
