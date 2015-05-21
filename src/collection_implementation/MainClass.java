package collection_implementation;

import java.util.*;

public class MainClass {
	
	public static void main(String... args){
		
		//ArrayList Implementation Starts
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Shikhar");
		al.add("Bansal");
		al.add("Darshan");
		al.add("Tejani");
		al.add("ravi");
		al.add("Darshan");
		
		Iterator itr = al.iterator();						//Iterator Created
		
		while(itr.hasNext()){								//iterating using While
			System.out.println(itr.next());
		}
		
		System.out.println("\n\n\n");
		
		for(String obj:al){									//iterating using For loop
			System.out.println(obj);
		}
		
															//Creating ArrayList of objects of class Student
		
		Student vikram = new Student(1200123,"Vikram Patel", 20);
		Student ravis = new Student(1200128,"Ravi Shankar", 22);
		Student ravip = new Student(1200127,"Ravi Prakash Verma", 23);
		Student darshan = new Student(1200135,"darshan tejani", 20);
		Student shikhar = new Student(1200132,"Shikhar Bansal", 19);
		Student rahul = new Student(1200122,"Rahul Pandya", 21);
		Student ojas = new Student(1200121,"Ojas Gupta", 21);
		
		ArrayList<Student> st1 = new ArrayList<Student>();
		
		st1.add(vikram);
		st1.add(rahul);
		st1.add(ravip);
		st1.add(ravis);
		st1.add(ojas);
		st1.add(shikhar);
		st1.add(darshan);
		
		Iterator itr1 = st1.iterator();
		
		while(itr1.hasNext()){
			Student temp = (Student)itr1.next();
			System.out.println(temp.rollno+"  "+temp.name+"  "+temp.age);
		}
		
		//ArrayList implementation Ends
		
		
		
		
		
	}
}
