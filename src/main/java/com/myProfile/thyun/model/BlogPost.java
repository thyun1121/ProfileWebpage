package com.myProfile.thyun.model;

import java.io.BufferedReader;
import java.io.Reader;
import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.tomcat.util.http.fileupload.IOUtils;

@Entity
@Table(name="TB_POST")
public class BlogPost {
	@Id
	@Column(name="POST_NO")
	private int postNo;
	@ManyToOne
	@JoinColumn(name="SUBJECT_NO")
	private BlogSubject subject;
	@Column(name="POST_TITLE")
	private String postTitle;
	@Column(name="POST_SUBTITLE")
	private String postSubtitle;
	@Column(name="POST_DATE")
	private String postDate;
	@Column(name="POST_URL")
	private String postUrl;
	@Column(name="POST_CONTS")
	private String postConts;
	
	
	public int getPostNo() {
		return postNo;
	}
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}
	
	public BlogSubject getSubject() {
		return subject;
	}
	public void setSubject(BlogSubject subject) {
		this.subject = subject;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostSubtitle() {
		return postSubtitle;
	}
	public void setPostSubtitle(String postSubtitle) {
		this.postSubtitle = postSubtitle;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public String getPostUrl() {
		return postUrl;
	}
	public void setPostUrl(String postUrl) {
		this.postUrl = postUrl;
	}
	public String getPostConts() {
		return postConts;
	}
	public void setPostConts(String postConts) {
		this.postConts = postConts;
	}
	
}
