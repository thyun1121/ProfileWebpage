package com.myProfile.thyun.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Artists {
	
	private String artistId;
	private String artistNm;
	private String artistClfy;
	private String artistDc;
	
	@Id
	@Column(name="ARTIST_ID")
	public String getArtistId() {
		return artistId;
	}
	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}
	
	@Column(name="ARTIST_NM")
	public String getArtistNm() {
		return artistNm;
	}
	public void setArtistNm(String artistNm) {
		this.artistNm = artistNm;
	}
	
	@Column(name="ARTIST_CLFY")
	public String getArtistClfy() {
		return artistClfy;
	}
	public void setArtistClfy(String artistClfy) {
		this.artistClfy = artistClfy;
	}
	
	@Column(name="ARTIST_DC")
	public String getArtistDc() {
		return artistDc;
	}
	public void setArtistDc(String artistDc) {
		this.artistDc = artistDc;
	}
	
	
	//@GeneratedValue
	
	

}
