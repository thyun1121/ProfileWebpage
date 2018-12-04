package com.myProfile.thyun.Controller;

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
	
	@RequestMapping(value = "/{posts_url}", method = RequestMethod.GET)
	public String findPostDetail(@PathVariable final String posts_url, Locale locale, Model model) {
		System.out.println("enter in postTitle controller??");
		System.out.println(posts_url);
		
		BlogPost bp = postSvc.findByPostsUrl(posts_url);
		model.addAttribute("blogPost", bp);
		return "post";
	}
	
}
