package Exception;

import java.io.IOException;

public class Exp10 {
	static void fun1 () 
	{
			
		fun2();
		
	}
	
	static void fun2()
	{
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun1();
		
		} 
		
	}


