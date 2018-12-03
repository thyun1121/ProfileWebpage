package com.myProfile.thyun.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_POSTS")
public class BlogPost {
	@Id
	@Column(name="POSTS_NO")
	private int posts_no;
	@Column(name="POSTS_TITLE")
	private String posts_title;
	@Column(name="POSTS_SUBTITLE")
	private String posts_subtitle;
	@Column(name="POSTS_DATE")
	private String posts_date;
	
	public int getPosts_no() {
		return posts_no;
	}
	public void setPosts_no(int posts_no) {
		this.posts_no = posts_no;
	}
	public String getPosts_title() {
		return posts_title;
	}
	public void setPosts_title(String posts_title) {
		this.posts_title = posts_title;
	}
	public String getPosts_subtitle() {
		return posts_subtitle;
	}
	public void setPosts_subtitle(String posts_subtitle) {
		this.posts_subtitle = posts_subtitle;
	}
	public String getPosts_date() {
		return posts_date;
	}
	public void setPosts_date(String posts_date) {
		this.posts_date = posts_date;
	}
	
	
	
}
