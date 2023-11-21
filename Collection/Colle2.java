package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Student{
	int roll;
	String name;
	
	public Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}

	public String toString(){
		return "Roll No:"+roll+" Name:"+name;
	}
}
public class Colle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> t1=new ArrayList<Student>();
		
		Student s1=new Student(101,"Ajay");
		Student s2=new Student(102,"Sanjay");
		Student s3=new Student(103,"Vijay");
		Student s4=new Student(104,"Akash");
		Student s5=new Student(105,"Mahesh");
		
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		t1.add(s4);
		t1.add(s5);
		
		System.out.println("Information in ArrayList");
		System.out.println(t1);
		
		System.out.println("Using For Each Loop");
		for(Student s:t1){
			System.out.println(s);
		}
		System.out.println("Using Iterator");
		Iterator<Student>itr=t1.iterator();
		while(itr.hasNext()){
			Student s=itr.next();
			System.out.println(s);
					
		}
		
		System.out.println("Add a new Object:");
		t1.add(new Student(106,"Mangesh"));
		System.out.println(t1);
		
		System.out.println("Using Get Method");
		for(int i=0;i<t1.size();i++){
			System.out.println(t1.get(i));
		}
		
		Student s7=new Student(102,"Anil");
		t1.set(2,s7);
		System.out.println(t1);
		
		t1.remove(3);
		System.out.println("After Removing Object");
		System.out.println(t1);
		
		int i=t1.indexOf(s2);
		System.out.println(i);
		
		if(t1.contains(s1)){
			System.out.println("Obejct is Present");
		}
		else {
			System.out.println("Obejct is not Present");
		}
		
		System.out.println("Using List Iterator");
		ListIterator<Student>itr1=t1.listIterator();
		while(itr1.hasNext()){
			Student s=itr1.next();
			System.out.println(s);
					
		}
		
		System.out.println("Reverse List");
		while(itr1.hasPrevious()){
			Student s=itr1.previous();
			System.out.println(s);
		}
		
		System.out.println("Using Sublist");
		List<Student> l1=t1.subList(2, 5);
		for(Student t: l1){
			System.out.println(t);
		}
		
	}

}
