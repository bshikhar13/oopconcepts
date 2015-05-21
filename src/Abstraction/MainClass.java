package Abstraction;

public class MainClass {

	public static void main(String args[]){    
		
		Bank b1 = new SBI();
		Bank b2 = new PNB();
		
		double interest1 = b1.getRateOfInterest();
		double interest2 = b2.getRateOfInterest();
		
		System.out.println("Rate of Interest SBI :  "+interest1+ "\nRate of Interest PNB : "+interest2);    
	
	}

}
