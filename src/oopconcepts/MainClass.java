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
		
		Account a1 = new Account(123456789,5669825.6);
		System.out.println(a1);
		
		Account a2 = new Account(123);
		System.out.println(a2);
		
		MyTime t1 = new MyTime(2,59,59);
		
		
		for (int i = 0; i < 10000; i++) {
			t1.nextSecond();
			System.out.println(t1);
			try {
			    Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
	
	}
	
}
