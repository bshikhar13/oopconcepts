package inheritence;

public class Human extends Animal{
	
	public Human () {
		System.out.println("A Human is born");
	}
	
	@Override
	public void say(){
		System.out.println("Hello !! World !!");
	}
	
	@Override
	public void eat(){
		System.out.println("Human eats Pizza");
	}
	
}
