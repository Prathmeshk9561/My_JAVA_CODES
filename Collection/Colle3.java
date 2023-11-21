package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Student1{
	int roll;
	String name;
	
	public Student1(int roll,String name){
		this.roll=roll;
		this.name=name;
	}

	public String toString(){
		return "Roll No:"+roll+" Name:"+name;
	}
}
public class Colle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<Student1> t1=new LinkedList<Student1>();
		
		Student1 s1=new Student1(101,"Ajay");
		Student1 s2=new Student1(102,"Sanjay");
		Student1 s3=new Student1(103,"Vijay");
		Student1 s4=new Student1(104,"Akash");
		Student1 s5=new Student1(105,"Mahesh");
		
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		t1.add(s4);
		t1.add(s5);
		
		System.out.println("Information in ArrayList");
		System.out.println(t1);
		
		System.out.println("Using For Each Loop");
		for(Student1 s:t1){
			System.out.println(s);
		}
		System.out.println("Using Iterator");
		Iterator<Student1>itr=t1.iterator();
		while(itr.hasNext()){
			Student1 s=itr.next();
			System.out.println(s);
					
		}
		
		System.out.println("Add a new Object:");
		t1.add(new Student1(106,"Mangesh"));
		System.out.println(t1);
		
		System.out.println("Using Get Method");
		for(int i=0;i<t1.size();i++){
			System.out.println(t1.get(i));
		}
		
		Student1 s7=new Student1(102,"Anil");
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
		ListIterator<Student1>itr1=t1.listIterator();
		while(itr1.hasNext()){
			Student1 s=itr1.next();
			System.out.println(s);
					
		}
		
		System.out.println("Reverse List");
		while(itr1.hasPrevious()){
			Student1 s=itr1.previous();
			System.out.println(s);
		}
		
		System.out.println("Using Sublist");
		List<Student1> l1=t1.subList(2, 5);
		for(Student1 t: l1){
			System.out.println(t);
		}
		
	}

}
