package Aggregation;

public class MainClass {

	public static void main(String... args){
		Author a1=new Author("Shikhar",19);
		Book b1=new Book("YoBook",15000,a1);
		b1.showDetail();
	 }
}
