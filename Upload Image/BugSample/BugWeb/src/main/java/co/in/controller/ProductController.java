package co.in.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import co.in.model.UploadItem;
import co.in.service.ProductService;

@Controller

public class ProductController 
{
	@Autowired
	private ProductService productservice;
	

	@RequestMapping("/product")
	public String saveProduct(Map<String,Object> map)
	{
		System.out.println("Inside Controller");
		
		System.out.println("Inside Get");
		map.put("userMap",new UploadItem());
			return "product";
	}
	
	@RequestMapping(value="/product",method = RequestMethod.POST)
	public String SingInAction(@ModelAttribute("userMap") UploadItem product,HttpServletRequest req,HttpServletResponse res,HttpSession session)
	{	
		System.out.println("Inside Post");
		MultipartFile files = product.getFileData();
		InputStream inputStream = null;
		OutputStream outputStream = null;
		String image = null;
		if (files.getSize() > 0) {
			try 
			{
				
				inputStream =files.getInputStream();
				outputStream = new FileOutputStream("D:\\tomcat\\apache-tomcat-9.0.8\\webapps\\images\\"+ files.getOriginalFilename());
				System.out.println("=============");
				System.out.println(files.getOriginalFilename());
				System.out.println("=============");
				int readBytes = 0;
				byte[] buffer = new byte[8192];
				while ((readBytes = inputStream.read(buffer, 0, 8192)) != -1) 
				{
					System.out.println("===ddd=======");
					outputStream.write(buffer, 0, readBytes);
				}
				outputStream.close();
				inputStream.close();
				
				image=files.getOriginalFilename();
				product.setFilename(image);
				
				//req.getSession().setAttribute("uploadFile","D:\\test111\\"+ files.getOriginalFilename());
				//session.setAttribute("uploadFile", "D:\\test111\\"+ files.getOriginalFilename());
				
			}
			
			catch (IOException e) {
				
				e.printStackTrace();
			}
		}
				//session.getAttribute("uploadFile");
		productservice.Product_Service_Demo(product);
		System.out.println("--------------------------------------");
		session.setAttribute("uploadFile", "D:\\tomcat\\apache-tomcat-9.0.8\\webapps\\images\\"+productservice.ServiceFindimage());
		
		System.out.println(req.getSession().getAttribute("uploadFile"));
		System.out.println(image);
		System.out.println(session.getAttribute("uploadFile"));
		return "product";
	
	}
	
	
	
}
		
		
		

