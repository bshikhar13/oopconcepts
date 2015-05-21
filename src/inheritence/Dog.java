package inheritence;

public class Dog extends Animal{
	
	public Dog () {
		System.out.println("A Dog is created");
	}
	
	@Override
	public void say(){
		System.out.println("Bark Bark !!");
	}
	
	@Override
	public void eat(){
		System.out.println("Dog eats Dog Food");
	}
	
}
