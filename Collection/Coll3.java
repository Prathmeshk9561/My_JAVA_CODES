package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
class Student{
	int roll;
	String name;
	
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	Student(){}
	public String toString(){
		return "\nRoll No:"+roll +
				"\nName:"+name;
	}
}
public class Coll3 {
	static Student[] arr=new Student[5];
		static void getdata(){
			arr[0]=new Student(101,"Ajay");
			arr[1]=new Student(102,"Sanjay");
			arr[2]=new Student(103,"Amit");
			arr[3]=new Student(104,"Samir");
			arr[4]=new Student(105,"Aniket");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> s1=new ArrayList<Student>();
		
		for(int i=0;i<5;i++){
			getdata();
		}
		
		for(int i=0;i<5;i++){
		s1.add(arr[i]);
		}
		
		System.out.println("Student List:");
		System.out.println(s1);
		
		for(Student a:s1){
			System.out.println(a);
		}
		
		System.out.println("After Student:");
		s1.add(new Student(6,"Ashsish"));
		System.out.println(s1);
		System.out.println("After removing:");
		s1.remove(2);
		System.out.println(s1);
				
		System.out.println(s1.get(2));
		
		s1.set(2,new Student(103,"Abhijit"));
		System.out.println(s1);
		
		System.out.println(s1.size());
	
		System.out.println("Using Iterator");
		Iterator<Student> itr=s1.iterator();
		
		while(itr.hasNext()){
			Student temp=itr.next();
			System.out.println(temp);
		}
		
		LinkedList<Student> l1=new LinkedList<Student>();
		
		}

	
}
