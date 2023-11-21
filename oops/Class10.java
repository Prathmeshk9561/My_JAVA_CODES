package oops;

public class Class10 {

		void fun1(){
			
			System.out.println("Calling Function1");
			fun1();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class10 c1=new Class10();
		c1.fun1();
	}

}
