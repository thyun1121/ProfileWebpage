  package com.myProfile.thyun.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.myProfile.thyun.model.BlogPost;

@EnableJpaRepositories("com.myProfile.thyun.Repository") 
//https://jdm.kr/blog/121  참고.
public interface HomeJpaRepository extends JpaRepository<BlogPost, String>{
	
	@Query("SELECT  A.posts_no"
			+",A.posts_title"
			+",A.posts_subtitle"
			+",TO_CHAR(A.posts_date,  'Month DD, YYYY', 'NLS_DATE_LANGUAGE=ENGLISH') AS posts_date \n"
			+",A.postsUrl \n"
			+"FROM BlogPost A \n"
			+"ORDER BY A.posts_no DESC")
	List<BlogPost> findPostListNoDesc();
	
	BlogPost findByPostsUrl(String postsUrl);
	
	
}
