package Aggregation;

public class Book {

	String name;
	int price;
	Author auth;
	
	Book(String name,int price,Author auth){
		this.name=name;
		this.price=price;
		this.auth=auth;
	}
	
	public void showDetail(){
	
		System.out.println("Book : "+name);
		System.out.println("price : "+price);
		System.out.println("Author : "+auth.getAuthorName());
	 }
	
}
