package Exception;

import java.io.IOException;

public class Ex9 {
	static void f1(){
		try{
		System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
			f1();
			
	}

}
