package oopconcepts;

public class MainClass {
	
	public static void main(String[] args){
		
		Circle c1, c2, c3 ;
		
		c1 = new Circle();
		c2 = new Circle(2.0);
		c3 = new Circle(3.0, "red");
		
		Circle c4 = new Circle();
		
		System.out.println(c3.getArea());
		System.out.println(c3.getRadius());
		
		//c2.radius = 
		System.out.println(c2);
	}
	
}
