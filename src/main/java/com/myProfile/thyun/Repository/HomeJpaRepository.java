  package com.myProfile.thyun.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.myProfile.thyun.model.BlogPost;

@EnableJpaRepositories("com.myProfile.thyun.Repository") 
//https://jdm.kr/blog/121  참고.
public interface HomeJpaRepository extends JpaRepository<BlogPost, String>{
	
	@Query("SELECT  A.postNo"
			+",A.postTitle"
			+",A.postSubtitle"
			+",TO_CHAR(A.postDate,  'Month DD, YYYY', 'NLS_DATE_LANGUAGE=ENGLISH') AS postDate \n"
			+",A.postUrl \n"
			+"FROM BlogPost A \n"
			+"ORDER BY A.postNo DESC")
	List<BlogPost> findPostListNoDesc();
	
	BlogPost findByPostUrl(String postUrl);
	
	
}
