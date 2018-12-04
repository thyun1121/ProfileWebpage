package com.myProfile.thyun.Controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myProfile.thyun.Service.HomeSvc;
import com.myProfile.thyun.model.BlogPost;

@Controller
public class HomeCtr {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeCtr.class);
	
	@Autowired
	private HomeSvc homeSvc;	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String findPostList(Locale locale, Model model) {
		List<BlogPost> postList = homeSvc.findPostList();
//		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("postList",postList);		
		return "index";
	}
	
}
