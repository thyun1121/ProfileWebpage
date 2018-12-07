package com.myProfile.thyun.Controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myProfile.thyun.Service.PostSvc;
import com.myProfile.thyun.model.BlogPost;

@Controller
@RequestMapping("/post/*")
public class PostCtr {
	
	private static final Logger logger = LoggerFactory.getLogger(PostCtr.class);
	
	@Autowired
	private PostSvc postSvc;	
	
	@RequestMapping(value = "/{postUrl}", method = RequestMethod.GET)
	public String findPostDetail(@PathVariable final String postUrl, Locale locale, Model model) {		
		/**
		 * https://cmsdk.com/mysql/failed-to-convert-from-type-java-lang-object-to-type.html
		 * 아래 함수 타입을 BlogPost로 하면 오류남.
		 * 왜냐하면 BlogPost에는 쿼리에서 조회하는 subjectNo 컬럼이 없기 때문.
		 * 그래서 List<Object[]> 타입으로 해야 오류를 해결할 수 있음. 신기방기.
		 */		
		List<BlogPost> bpList = postSvc.findByPostUrlWithSubject(postUrl);
		System.out.println(bpList.size());
		model.addAttribute("blogPost", bpList.get(0));
		return "post";
	}
	
}
