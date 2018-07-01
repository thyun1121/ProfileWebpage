package com.myProfile.thyun.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProfile.thyun.Repository.WorldCupJpaRepository;
import com.myProfile.thyun.model.Artists;

@Service
public class WorldCupSvc {
	@Autowired
	private WorldCupJpaRepository worldJpaRepository;
	
	public List<Artists> tournament(){
		return worldJpaRepository.findAll();
	}
}
