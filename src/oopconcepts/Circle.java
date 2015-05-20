package oopconcepts;

public class Circle {
	
	private double radius;
	private String color;
	
													//Constructor Declarations 
	
	public Circle(){
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r){
		radius = r;
		color = "red";
	}
	
	public Circle(double r, String s){
		radius = r;
		color = s;
	}
	
													//Constructors Declaration ends
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;				 
	}
	
	public String getColor(){
		return color;
	}
	
	
}
