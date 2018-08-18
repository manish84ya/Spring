package com.aartek.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="product")

public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productid")
	private Integer productid;
	@Column(name = "prodname")
	private String prodname;
	@Column(name = "proddesc")
	private String proddesc;
	@Column(name = "prodqty")
	private String prodqty;
	@Column(name = "prodprice")
	private String prodprice;
	
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getProddesc() {
		return proddesc;
	}
	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}
	public String getProdqty() {
		return prodqty;
	}
	public void setProdqty(String prodqty) {
		this.prodqty = prodqty;
	}
	public String getProdprice() {
		return prodprice;
	}
	public void setProdprice(String prodprice) {
		this.prodprice = prodprice;
	}
	
/*	@OneToMany(targetEntity=ProductImage.class,cascade=CascadeType.ALL)
	@JoinColumn(name="productID",referencedColumnName="productID")
	private List<ProductImage> productImage;
*/
	
	
}
