  package com.myProfile.thyun.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.myProfile.thyun.model.BlogPost;

@EnableJpaRepositories("com.myProfile.thyun.Repository") 
//https://jdm.kr/blog/121  참고.
//https://matthew.kr/spring-boot-jpa%EC%97%90%EC%84%9C-update-%EC%BF%BC%EB%A6%AC-%EC%82%AC%EC%9A%A9%EC%8B%9C-xxx-is-not-mapped-%EC%97%90%EB%9F%AC-%EB%B0%9C%EC%83%9D%EC%8B%9C-%EB%8C%80%EC%B2%98%EB%B0%A9%EB%B2%95/ 참고.
public interface HomeJpaRepository extends JpaRepository<BlogPost, String>{
	@Query("SELECT  A.posts_no"
			+",A.posts_title"
			+",A.posts_subtitle"
			+",TO_CHAR(A.posts_date,  'MONTH DD, YYYY') AS posts_date \n"
			+"FROM BlogPost A \n"
			+"ORDER BY A.posts_no DESC")
	List<BlogPost> findPostListNoDesc();
}
