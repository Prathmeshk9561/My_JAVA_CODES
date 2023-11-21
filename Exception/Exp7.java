package Exception;

import java.io.IOException;

public class Exp7 {
	static void fun1()
	{
		try{	
		System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("AE handled");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun1();
		}
		
	}


