package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
class Student1{
	int roll;
	String name;
	
	Student1(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	Student1(){}
	public String toString(){
		return "\nRoll No:"+roll +
				"\nName:"+name;
	}
}
public class Coll4 {
	static Student1[] arr=new Student1[5];
	
	static void getdata(){
			arr[0]=new Student1(101,"Ajay");
			arr[1]=new Student1(102,"Sanjay");
			arr[2]=new Student1(103,"Amit");
			arr[3]=new Student1(104,"Samir");
			arr[4]=new Student1(105,"Aniket");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student1> l1=new LinkedList<Student1>();
		
		for(int i=0;i<5;i++){
			getdata();
		}
		for(int i=0;i<5;i++){
			l1.add(arr[i]);
		}
				
		System.out.println("Using Iterator");
		Iterator<Student1> itr=l1.iterator();
		
		while(itr.hasNext()){
			Student1 temp=itr.next();
			System.out.println(temp);
		}
		/*
		ystem.out.println("Using Iterator");
		Iterator<Student1> itr1=l1.iterator();
		while(itr1.hasPrevious(){
			Student1 temp=itr1.Previous();
			System.out.println(temp);
		}
		}
		*/
	
	}

	
}
