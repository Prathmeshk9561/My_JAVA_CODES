package Inheritance;
class Student{
	int roll;
	String name;
	Student(int roll, String name){
		this.roll=roll;
		this.name=name;
	}
	
}
class Marks extends Student{
	int m1,m2,m3;
	Marks(int m1,int m2,int m3,int r,String Name){
		super(r,Name);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
}

class Result extends Marks{
	int total;
	Result(int m1,int m2,int m3,int r,String Name){
		super(m1,m2,m3,r,Name);
		total=m1+m2+m3;
	}
	void show(){
		System.out.println("Roll No:"+roll);
		System.out.println("Name:"+name);
		System.out.println("Marks are:"+m1+" "+m2+" "+m3);
		System.out.println("Total:"+total);
	}
}

public class Inh5 {
public static void main(String [] Args){
	Result r1=new Result(55,56,57,101,"Amol");
	r1.show();
}
}
