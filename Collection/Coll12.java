package Collection;

import java.util.HashMap;
class Employee3{
	int empid;
	String name;
	public Employee3(int empid,String name){
		this.empid=empid;
		this.name=name;
	}
	public String toString(){
		return "Emp Id:"+empid+" Name:"+name;
	}
}
public class Coll12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Employee3> h=new HashMap<Integer,Employee3>();
		Employee3 e1=new Employee3(101,"Ajay");
		Employee3 e2=new Employee3(102,"Sanjay");
		Employee3 e3=new Employee3(103,"Anil");
		Employee3 e4=new Employee3(104,"Akash");
		Employee3 e5=new Employee3(105,"Vijay");
		h.put(1,e1);
		h.put(2,e2);
		h.put(3,e3);
			
		System.out.println(h);
		
		System.out.println(h.keySet());
		System.out.println(h.values());
		
		System.out.println(h.containsKey(4));
		
		
	}

}
