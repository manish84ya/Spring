package com.aartek.controller;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aartek.model.Product;
import com.aartek.model.User;
import com.aartek.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	final static Logger logger = Logger.getLogger(LoginController.class);
	
	@GetMapping("/")
	public String indexShow() 
	{
		return "index";
	}
	@GetMapping("/registration")
	public String signUpGet(Model model)
	{
		logger.info("Inside Registration GET Method:");
		  model.addAttribute("regMap",new User());
		  return "registration";
	}
	@PostMapping("/registration")
	public String signUpPost(@ModelAttribute("regMap") User user)
	{
		logger.info("Inside Registration POST Method:");
		logger.info(user.getEmail()+" "+user.getFirstname());
		loginservice.saveUserRecordService(user);
		return "login";
	}
	
	@GetMapping("/login")
	public String userLogin(Model model)
	{
		logger.info("Inside controller GET:userLogin()...");
		model.addAttribute("userMap",new User());
		return "login";
	}
	@PostMapping("/login")
	public String userLogin(@ModelAttribute("userMap") User user,HttpServletResponse res,HttpServletRequest req,Model model)
	{
		logger.info("Inside controller POST:userLogin()...");
		boolean status=loginservice.checkLogin(user);
		if(status==true)
		{
			req.getSession().setAttribute("username",user.getFirstname());
			return "redirect:/product";
		}
		else
			{
				return "login";
			}
	}
	@GetMapping("/product")
	public String productAdd(Model model,Product product)
	{
		logger.info("Inside controller GET:productAdd()...");
		model.addAttribute("productMap",new Product());
		model.addAttribute("prodList",loginservice.productGetRecordService(product));
		return "product";
	}
	@PostMapping("/product")
	public String productAdd(@ModelAttribute("productMap") Product product,BindingResult result,Model model)
	{
		logger.info("Inside controller POST:productAdd()...");
		loginservice.productSaveRecordService(product);
		
		model.addAttribute("prodList",loginservice.productGetRecordService(product));
		return "product";
	}
	
	@GetMapping("/edit-{id}")
	public String productEditAndUpdate(@PathVariable Integer id, Model model,Product product,HttpServletResponse res,HttpServletRequest req)
	{
		Product prod=loginservice.findProductByIDService(id);
		model.addAttribute("productMap",prod);
		return "update";
	}
	
	@PostMapping("/editSave")
	public String productEditAndUpdate(@ModelAttribute("productMap") Product product,Model model,HttpServletResponse res,HttpServletRequest req,BindingResult result)
	{
		Product prod=loginservice.updateProductByIDService(product);
		return "redirect:/product";
	}
	
	@GetMapping("/delete-{id}")
	public String productDelete(@PathVariable Integer id, Model model,Product product,HttpServletResponse res,HttpServletRequest req)
	{
		loginservice.deleteProductService(id);
		return "redirect:/product";
	}
	
	
	
}

