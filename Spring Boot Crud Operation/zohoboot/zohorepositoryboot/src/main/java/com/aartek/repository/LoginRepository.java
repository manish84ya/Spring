package com.aartek.repository;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aartek.model.Product;
import com.aartek.model.User;

@Repository
@Transactional
public class LoginRepository {

	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	final static Logger logger = Logger.getLogger(LoginRepository.class);
	public String saveUserRecordRepository(User user)
	{
		logger.debug("Inside Repository:");
		hibernatetemplate.save(user);
		return "registration";
	}
	
	public User checkLogin(User user)
	{
		logger.debug("Inside Repository : Login");
		List<User> list=(List<User>) hibernatetemplate.find("from User u where u.email=? and u.password=? ",user.getEmail(),user.getPassword());
		User usr = null;
	 	for(Iterator<User> itr=list.iterator();itr.hasNext();)
		 {
			  usr=(User)itr.next();
			  System.out.println("    "+usr.getEmail()+"   " +usr.getPassword() );
		 }
	 	return usr;
	}
	public Product productSaveRecordRepository(Product product)
	{
		logger.debug("Inside Repository:productSaveRecordRepository()");
		hibernatetemplate.save(product);
		return product;
	}
	public List<Product> productGetRecordRepository(Product product)
	{
		logger.debug("Inside Repository:productGetRecordRepository()");
		List<Product> pro=hibernatetemplate.loadAll(Product.class);
		Product prod1=null;
		for(Iterator<Product> itr=pro.iterator();itr.hasNext();)
		{
		 prod1=(Product)itr.next();
		 logger.debug(" Product Name: "+prod1.getProdname()+" Product Description "+prod1.getProddesc()+ " Product Price "+prod1.getProdprice()+" Proudct Quantity "+prod1.getProdqty());
		}
		return pro;
	}
	public Product findProductByIDRepository(Integer id)
	{
		logger.warn("Inside Service findProductByIDService() :");
		List<Product> l=(List<Product>) hibernatetemplate.find("from Product u where u.productid=?",id);
	 	Product prod1 = null;
	 	for(Iterator<Product> itr=l.iterator();itr.hasNext();)
		 {
	 		prod1=(Product)itr.next();
	 		 logger.debug(" Product Name: "+prod1.getProdname()+" Product Description "+prod1.getProddesc()+ " Product Price "+prod1.getProdprice()+" Proudct Quantity "+prod1.getProdqty());
		 }
		
		return prod1;
	}
	public Product updateProductByIDRepository(Product product)
	{
		logger.warn("Inside Service updateProductByIDService() :");
		hibernatetemplate.update(product);
		return product;
	}
	
	public void deleteProductRepository(Integer id)
	{
		logger.warn("Inside Service deleteProductRepository() :");
		Product product=findProductByIDRepository(id);
		hibernatetemplate.delete(product);
	}
}
