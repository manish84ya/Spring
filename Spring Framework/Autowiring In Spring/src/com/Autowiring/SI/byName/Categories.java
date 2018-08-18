package com.Autowiring.SI.byName;

public class Categories 
{
	private String category;
	Book b;
	//Book b1;


/*public Categories() 
  {


  }
	
public Categories(Book b) 
  {

		this.b=b;

  }

*/
	
  public String getCategory() {
	return category;
}


/*public Book getB1() {
	return b1;
}


public void setB1(Book b1) {
	this.b1 = b1;
}
*/

public void setCategory(String category) {
	this.category = category;
}


public Book getB() {
	return b;
}


public void setB(Book b) {
	this.b = b;
}


public void display()
{
	System.out.println("Book Id:"+b.getBook_id());
	System.out.println("Book Name:"+b.getBook_name());
	System.out.println("Book Price:"+b.getBook_price());
	System.out.println("Book Author:"+b.getAuthor());
	System.out.println("Book Categories:"+category);
	System.out.println(b.hashCode());
	/*System.out.println(b1.hashCode());
	System.out.println("Book Id:"+b1.getBook_id());
	System.out.println("Book Name:"+b1.getBook_name());
	System.out.println("Book Price:"+b1.getBook_price());
	System.out.println("Book Author:"+b1.getAuthor());
	*/System.out.println("Book Categories:"+category);
	
}
  }
