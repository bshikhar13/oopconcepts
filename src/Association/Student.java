package Association;

public class Student {
	protected String name;
	
	public Student(String name){
		this.name = name;
	}
	
	public void getsTaughtBy(Teacher t1){
		System.out.println("I am student "+ name +" and I am taught by Professor "+t1.name);
	}
	
}
