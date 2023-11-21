package Exception;

import java.io.IOException;

public class Exp9 {
	static void fun1 () throws ArithmeticException
	{
			
		System.out.println(10/0);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		fun1();
		}
		catch(ArithmeticException e){
			System.out.println("AE handled");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		}
		
	}


