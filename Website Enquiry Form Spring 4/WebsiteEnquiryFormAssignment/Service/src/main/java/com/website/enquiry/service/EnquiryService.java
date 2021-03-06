package com.website.enquiry.service;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.enquiry.model.EnquiryDTO;
import com.website.enquiry.repository.EnquiryRepository;

@Service
@Transactional
public class EnquiryService 
{
	private static final  Logger logger = Logger.getLogger(EnquiryService.class);
	
	@Autowired
	private EnquiryRepository enquiryRepository;
	
	public EnquiryDTO getEnquiryService(EnquiryDTO enquiry)
	{
		logger.info("Inside Service method");
		if(enquiry.getPromotionalMsg()==null)
		{
			enquiry.setPromotionalMsg(false);
		}
		logger.info(enquiry.getEnquiryPersonName()+" "+enquiry.getEmailId()+" "+enquiry.getContactNumber()+" "+enquiry.getProfession()+" "+enquiry.getPromotionalMsg()+" "+enquiry.getComment());
		enquiryRepository.save(enquiry);
		return enquiry;
	}
	

}
