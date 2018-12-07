package com.myProfile.thyun.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_SUBJECT")
public class BlogSubject {
	@Id
	@Column(name="SUBJECT_NO")
	private int subjectNo;
	@Column(name="SUBJECT_NAME")
	private String subjectName;
	@Column(name="SUBJECT_IMG_URL")
	private String subjectImgUrl;
	public int getSubjectNo() {
		return subjectNo;
	}
	public void setSubjectNo(int subjectNo) {
		this.subjectNo = subjectNo;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectImgUrl() {
		return subjectImgUrl;
	}
	public void setSubjectImgUrl(String subjectImgUrl) {
		this.subjectImgUrl = subjectImgUrl;
	}
}
