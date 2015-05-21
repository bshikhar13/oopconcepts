package Association;

public class MainClass {

	public static void main(String... args){
		
		Teacher t1 = new Teacher("HC Verma","Physics");
		Student s1 = new Student("Shikhar");
		
		t1.teaches(s1);
		System.out.println("\n");
		s1.getsTaughtBy(t1);
	 } 
}
