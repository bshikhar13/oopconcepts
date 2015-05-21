package Association;

public class Teacher {
	private String subject;
	protected String name ;
	
	public Teacher(String name, String subject){
		this.subject = subject;
		this.name = name;
	}
	
	public void teaches(Student s1){
		System.out.println("I am professor "+ name +" and I teach Student "+s1.name+ " My subject is "+subject);
	}
	
}
