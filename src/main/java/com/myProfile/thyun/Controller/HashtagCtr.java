package com.myProfile.thyun.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myProfile.thyun.Service.HashtagSvc;
import com.myProfile.thyun.model.BlogPost;

@Controller
@RequestMapping("/tag/*")
public class HashtagCtr {
	
	private static final Logger logger = LoggerFactory.getLogger(HashtagCtr.class);
	
	@Autowired
	private HashtagSvc hashtagSvc;	
	
//	@RequestMapping(value = "", method = RequestMethod.GET)
//	public String redirectToHashtagList(Locale locale, Model model) {		
//			
//		return "tag";
//	}
	
	@RequestMapping(value = "/{tagName}", method = RequestMethod.GET)
	public String findPostDetail(@PathVariable final String tagName, Locale locale, Model model) {		
		/**
		 * https://cmsdk.com/mysql/failed-to-convert-from-type-java-lang-object-to-type.html
		 * 아래 함수 타입을 BlogPost로 하면 오류남.
		 * 왜냐하면 BlogPost에는 쿼리에서 조회하는 subjectNo 컬럼이 없기 때문.
		 * 그래서 List<Object[]> 타입으로 해야 오류를 해결할 수 있음. (service에 타입 지정함.) 신기방기.
		 */		
		List<BlogPost> resultList = hashtagSvc.findPostsByHashtagName(tagName);
		
		model.addAttribute("postList",resultList);
		Map<String, Object> extraData = new HashMap<String, Object>();
		extraData.put("cnt", resultList.size());
		extraData.put("tagName", tagName);
		model.addAttribute("extraData", extraData);
		return "tagPosts";
	}

	
}
