package com.Autowiring.SI.byName;

public class Book 
{
	private Integer book_id;
	private String book_name;
	private String author;
	private Long book_price;

	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Long getBook_price() {
		return book_price;
	}
	public void setBook_price(Long book_price) {
		this.book_price = book_price;
	}
	
	

}
