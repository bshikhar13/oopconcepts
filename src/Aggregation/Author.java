package Aggregation;

public class Author {
	 
	String authorName;
	int age;
	
	Author(String authorName,int age){
		this.authorName=authorName;
		this.age=age;
	}
	 
	public String getAuthorName(){
		return authorName;
	}
	 
	public int getAge(){
		return age;
	}
	 
}
