package Exception;

import java.io.IOException;

public class Exp6 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
		System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("AE Handled");
		}
		
	}

}
