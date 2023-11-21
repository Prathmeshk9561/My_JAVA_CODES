package Inheritance;

import java.util.Scanner;

//Hierarchical Inheritance
class Media{
	String name;
	int price;
	Scanner sc=new Scanner(System.in);
	void getdata(){
		System.out.println("Enter Name:");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter Price:");
		price=sc.nextInt();
	}
}
class Book extends Media{
	int page;
	
	void getpages(){
		System.out.println("Enter Number of Pages:");
		page=sc.nextInt();
	}
	void show(){
		System.out.println("Book Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Pages:"+page);
	}
}
class Tape extends Media{
	int time;
	void gettime(){
		System.out.println("Enter Time:");
		time=sc.nextInt();
	}
	void show(){
		System.out.println("Book Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Time:"+time);
	}
}

public class Inh6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		b1.getdata();
		b1.getpages();
		b1.show();
		
		Tape t1=new Tape();
		t1.getdata();
		t1.gettime();
		t1.show();
	}

}
