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

import com.myProfile.thyun.Service.WorldCupSvc;
import com.myProfile.thyun.model.WorldcupNation;

@Controller
public class WorldCupCtr {
	
	private static final Logger logger = LoggerFactory.getLogger(WorldCupCtr.class);
	
	@Autowired
	private WorldCupSvc worldCupSvc;	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/tournament", method = RequestMethod.GET)
	public String tournament(Locale locale, Model model) {
		logger.info("testing for WorldCup. The client locale is {}.", locale);		
		List<WorldcupNation> nationsList = worldCupSvc.tournament();
		//System.out.println(nationsList.get(0).getNation());
		//System.out.println(artists.get(0).getArtistId());
		//model.addAttribute("nationalList",nationsList);
		
		return "sessionInfo";
	}
	
	@RequestMapping(value = "/getMemberInfo", method = RequestMethod.GET)
	public String getMemberInfo(Locale locale, Model model) {
		logger.info("testing for getMemberInfo. The client locale is {}.", locale);		
		return "getMemberInfo";
	}
	
	@RequestMapping(value = "/setMemberInfo", method = RequestMethod.GET)
	public String setMemberInfo(Locale locale, Model model) {
		return "setMemberInfo";
	}
	
	@RequestMapping(value = "/sessionClose", method = RequestMethod.GET)
	public String sessionClose(Locale locale, Model model) {
		return "sessionClose";
	}
	
	@RequestMapping(value = "/sessionInfo", method = RequestMethod.GET)
	public String sessionInfo(Locale locale, Model model) {
		return "sessionInfo";
	}
	
	@RequestMapping(value = "/setSessionTime", method = RequestMethod.GET)
	public String setSessionTime(Locale locale, Model model) {
		return "setSessionTime";
	}
	
	
}
