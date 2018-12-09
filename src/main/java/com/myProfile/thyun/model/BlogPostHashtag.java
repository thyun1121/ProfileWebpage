package com.myProfile.thyun.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_POST_HASHTAG")
public class BlogPostHashtag {
	@Id
	@Column(name="POST_HASHTAG_NO")
	private int postHashTagNo;
	@ManyToOne
	@JoinColumn(name="POST_NO")
	private BlogPost post;
	
	@ManyToOne
	@JoinColumn(name="HASHTAG_NO")
	private BlogHashtag hashtag;

	
	public int getPostHashTagNo() {
		return postHashTagNo;
	}

	public void setPostHashTagNo(int postHashTagNo) {
		this.postHashTagNo = postHashTagNo;
	}

	public BlogPost getPost() {
		return post;
	}

	public void setPost(BlogPost post) {
		this.post = post;
	}

	public BlogHashtag getHashtag() {
		return hashtag;
	}

	public void setHashtag(BlogHashtag hashtag) {
		this.hashtag = hashtag;
	}
}
