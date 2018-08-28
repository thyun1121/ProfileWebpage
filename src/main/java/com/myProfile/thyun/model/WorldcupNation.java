package com.myProfile.thyun.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="WORLDCUP_NATION")
public class WorldcupNation {
	
	private String nation;
	private String flag;
	
	@Id
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
}
