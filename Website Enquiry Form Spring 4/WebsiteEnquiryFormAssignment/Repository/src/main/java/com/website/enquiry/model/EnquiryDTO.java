package com.website.enquiry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Enquiry")
public class EnquiryDTO 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="enquiryId")
	private Integer enquiryId;
	
	@Column(name="enquiryPersonName")
	private String enquiryPersonName;

	@Column(name="contactNumber")
	private Long contactNumber;

	@Column(name="emailId")
	private String emailId;

	@Column(name="profession")
	private String profession;

	@Column(name="promotionalMsg")
	private Boolean promotionalMsg;

	@Column(name="comment")
	private String comment;

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
	}
	public String getEnquiryPersonName() {
		return enquiryPersonName;
	}
	public void setEnquiryPersonName(String enquiryPersonName) {
		this.enquiryPersonName = enquiryPersonName;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Boolean getPromotionalMsg() {
		return promotionalMsg;
	}
	public void setPromotionalMsg(Boolean promotionalMsg) {
		this.promotionalMsg = promotionalMsg;
	}
	

}
