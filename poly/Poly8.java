package poly;
class Customer{
	int custid;
	String name;
	int age;
	Customer(int i,String n, int a){
		custid=i;
		name=n;
		age=a;
	}
	void get(){
		System.out.println("Customer Id:"+custid);
		System.out.println("Customer Name:"+name);
		System.out.println("Age:"+age);
	}
	public String toString(){
		String s;
		s="Customer Id:"+custid+" Name:"+name+" Age:"+age;
		return s;
	}
}


public class Poly8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer(101,"Amit",22);
		c1.get();
		System.out.println(c1.toString());
		System.out.println(c1);
		System.out.println(c1.hashCode());
		System.out.println(Integer.toHexString(c1.hashCode()));

		System.out.println(c1.getClass());
		System.out.println(c1.getClass().getName());
		String s="Sachin";
		System.out.println(s.getClass());
		System.out.println(s.getClass().getName());
		System.out.println(s.getClass().getSuperclass());
		
	}

}
