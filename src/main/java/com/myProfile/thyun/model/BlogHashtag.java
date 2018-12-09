package com.myProfile.thyun.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_HASHTAG")
public class BlogHashtag {
	@Id
	@Column(name="HASHTAG_NO")
	private int hashtagNo;
	@Column(name="HASHTAG_NAME")
	private String hashtagName;
	
	public int getHashtagNo() {
		return hashtagNo;
	}
	public void setHashtagNo(int hashtagNo) {
		this.hashtagNo = hashtagNo;
	}
	public String getHashtagName() {
		return hashtagName;
	}
	public void setHashtagName(String hashtagName) {
		this.hashtagName = hashtagName;
	}
	
	
}
