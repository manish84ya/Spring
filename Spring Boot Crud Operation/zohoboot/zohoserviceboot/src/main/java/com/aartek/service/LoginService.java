package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.apache.log4j.Logger;

import com.aartek.model.Product;
import com.aartek.model.User;
import com.aartek.repository.LoginRepository;


@Service
public class LoginService {
	@Autowired
	private LoginRepository loginrepository; 
	Boolean status=false;
	
	final static Logger logger = Logger.getLogger(LoginService.class);

	public String saveUserRecordService(User login)
	{
		logger.warn("Inside Service singUpService() :");
		loginrepository.saveUserRecordRepository(login);
		return "hello";
		
	}
	public boolean checkLogin(User user)
	{
		logger.warn("Inside Service : Login");
		User user1=loginrepository.checkLogin(user);
		if(user1!=null)
		{
			logger.warn("Valid User");
			status=true;
		}
		else 
		{
			logger.warn("Not Valid User");
		}
		return status;
	}
	
	public Product productSaveRecordService(Product product)
	{
		logger.warn("Inside Service productSaveRecordService() :");
		loginrepository.productSaveRecordRepository(product);
		return product;
	}
	public List<Product> productGetRecordService(Product product)
	{
		logger.warn("Inside Service productGetRecordService() :");
		List<Product> list=loginrepository.productGetRecordRepository(product);
		return list;
	}
	public Product findProductByIDService(Integer id)
	{
		logger.warn("Inside Service findProductByIDService() :");
		Product prod=loginrepository.findProductByIDRepository(id);
		return prod;
	}
	public Product updateProductByIDService(Product product)
	{
		logger.warn("Inside Service updateProductByIDService() :");
		Product prod=loginrepository.updateProductByIDRepository(product);
		return prod;
	}
	public void deleteProductService(Integer id)
	{
		logger.warn("Inside Service deleteProductService() :");
		loginrepository.deleteProductRepository(id);
	}
	
}