package com.website.enquiry.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.website.enquiry.model.EnquiryDTO;
import com.website.enquiry.service.EnquiryService;

@Controller
public class EnquiryController 
{
	static	final  Logger logger = Logger.getLogger(EnquiryController.class);
	
	@Autowired 
	private EnquiryService enquiryService;

	@RequestMapping(value= "/",method=RequestMethod.GET)
	public String getEnquiryFormDetail(Model model)
	{
		logger.info("Inside Controller...GET..getEnquiryFormDetail()...");
		model.addAttribute("enquiry",new EnquiryDTO());
		return "EnquiryPage";
	}
	
	@RequestMapping(value= "/enquiryDetail",method=RequestMethod.POST)
	public String getEnquiryFormDetail(@ModelAttribute("enquiry") EnquiryDTO enquiry)
	{
		logger.info("Inside Controller...POST..getEnquiryFormDetail()...");
		logger.info(enquiry.getEnquiryPersonName()+" "+enquiry.getEmailId()+" "+enquiry.getContactNumber()+" "+enquiry.getProfession()+" "+enquiry.getPromotionalMsg()+" "+enquiry.getComment());
		enquiryService.getEnquiryService(enquiry);
		return "EnquiryPage";
			
	}
	
	


}