package com.myProfile.thyun.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProfile.thyun.Repository.WorldCupJpaRepository;
import com.myProfile.thyun.model.WorldcupNation;

@Service
public class WorldCupSvc {
	@Autowired
	private WorldCupJpaRepository worldJpaRepository;
	
	public List<WorldcupNation> tournament(){
		return worldJpaRepository.findAll();
	}
}
