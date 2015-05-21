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
		
		ListIterator<String> itr = al.listIterator();						//Iterator Created
		
		System.out.println("Accessing ArrayList in Forward Direction using While Loop\n");
		
		while(itr.hasNext()){								//iterating using While
			System.out.println(itr.next());
		}
		
		System.out.println("\n\n\n");
		

		System.out.println("Accessing ArrayList in Forward Direction using For Loop\n");
		
		
		for(String obj:al){									//iterating using For loop
			System.out.println(obj);
		}
		
		System.out.println("\n\n\nAccessing Arraylist in Backward Direction using while Loop\n");
		
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
															
		al.add(4, "Wild card Entry");						//Adding data at a certain index
		
		System.out.println(al.get(4));						//Accessing element of a certain Index
		
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
		
		//LinkedList implementation Starts
		
		LinkedList<Student> studentLinkedList1 = new LinkedList<Student>();
		
		studentLinkedList1.add(vikram);
		studentLinkedList1.add(ojas);
		studentLinkedList1.add(rahul);
		studentLinkedList1.add(shikhar);
		studentLinkedList1.add(ravip);
		studentLinkedList1.add(ravis);
		studentLinkedList1.add(darshan);
		
		Iterator<Student> itr2 = studentLinkedList1.iterator();
		
		while(itr2.hasNext()){
			Student temp = itr2.next();
			System.out.println(temp.rollno+"  "+temp.name+"  "+temp.age);
		}
		
		
		//LinkedList implementation Ends
		//hashSet implementation begins
		
		HashSet<Student> studentHashSet  = new HashSet<Student>();
		studentHashSet.add(ojas);
		studentHashSet.add(rahul);
		studentHashSet.add(shikhar);
		studentHashSet.add(darshan);
		studentHashSet.add(darshan);
		studentHashSet.add(darshan);
		studentHashSet.add(ravis);
		studentHashSet.add(rahul);
		
		Iterator<Student> hashSetIterator = studentHashSet.iterator();
		
		System.out.println("\n\nPrinting HashSet for Students\n\n");
		
		while (hashSetIterator.hasNext()) {
			
			Student temp = hashSetIterator.next();
			System.out.println(temp.rollno+"   "+temp.name);
			
		}
		
		//HashSet implementation Ends
		//LinkedHashSet implementation  Starts
		
		LinkedHashSet<Student> linkedStudentHashSet = new LinkedHashSet<Student>();
		
		linkedStudentHashSet.add(ojas);
		linkedStudentHashSet.add(rahul);
		linkedStudentHashSet.add(shikhar);
		linkedStudentHashSet.add(darshan);
		linkedStudentHashSet.add(darshan);
		linkedStudentHashSet.add(darshan);
		linkedStudentHashSet.add(ravis);
		linkedStudentHashSet.add(rahul);
		
		Iterator<Student> linkedStudentHashSetIterator = linkedStudentHashSet.iterator();
		
		System.out.println("\n\nPrinting LinkedHashSet for Students\n\n");
		
		while (linkedStudentHashSetIterator.hasNext()) {
			
			Student temp = linkedStudentHashSetIterator.next();
			System.out.println(temp.rollno+"   "+temp.name);
			
		}
		
		//LinkedHashSet implementation Ends
		//TreeSet implementation Begins
		
		TreeSet<String> treeSetStudent = new TreeSet<String>();
		
		treeSetStudent.add("ojas");
		treeSetStudent.add("rahul");
		treeSetStudent.add("shikhar");
		treeSetStudent.add("darshan");
		treeSetStudent.add("darshan");
		treeSetStudent.add("darshan");
		treeSetStudent.add("ravis");
		treeSetStudent.add("rahul");
		
		Iterator<String> treeSetStudentIterator = treeSetStudent.iterator();
		
		System.out.println("\n\nPrinting TreeSet for Students\n\n");
		
		while (treeSetStudentIterator.hasNext()) {
			
			System.out.println(treeSetStudentIterator.next());
			
		}
		
		//TreeSet implementation Ends
		//PriorityQueue Implementation Begins
		
		PriorityQueue<String> priorityQueueStudent = new PriorityQueue<String>();
		
		priorityQueueStudent.add("vikram");
		priorityQueueStudent.add("ojas");
		priorityQueueStudent.add("darshan");
		priorityQueueStudent.add("shikhar");
		priorityQueueStudent.add("ravis");
		priorityQueueStudent.add("ravip");
		priorityQueueStudent.add("vikram");
		
		Iterator<String> priorityQueueStudentIterator = priorityQueueStudent.iterator();
		
		System.out.println("\n\nPrinting Priority Queus for Students");
		
		while(priorityQueueStudentIterator.hasNext()){
			
			System.out.println(priorityQueueStudentIterator.next());
			
		}
		

		System.out.println("head:"+priorityQueueStudent.element());  
		System.out.println("head:"+priorityQueueStudent.peek());
		
		priorityQueueStudent.remove();
		priorityQueueStudent.remove();
		priorityQueueStudent.remove();
		priorityQueueStudent.remove();
		priorityQueueStudent.remove();
		
		priorityQueueStudent.add("Zakhira");
		priorityQueueStudent.add("ravip");
		
		
		Iterator<String> priorityQueueStudentIterator1 = priorityQueueStudent.iterator();
		
		System.out.println("\nPrinting Priority Queue after removing an element\n");
		
		while(priorityQueueStudentIterator1.hasNext()){
			
			System.out.println(priorityQueueStudentIterator1.next());
			
		}
		
		//PriorityQueue Implementation Ends
		//Hashmap Implementation Starts
		
		HashMap<Integer, String> studentRollIndex = new HashMap<Integer, String>();
		
		studentRollIndex.put(1200132, "Shikhar Bansal");
		studentRollIndex.put(1200135, "Darshan tejani");
		studentRollIndex.put(1200123, "Vikram patel");
		
		System.out.println("\nPrinting HashMap for Students\n");
		
		for(Map.Entry m:studentRollIndex.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//HashMap implementation ends 
	}
}
