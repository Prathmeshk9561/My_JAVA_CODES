package Exception;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		try{
		System.out.println("Enter Numerator");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter Denominator");
		b=sc.nextInt();
		
		c=a/b;
		System.out.println("Division:"+c);
		}
		catch(InputMismatchException e){
			System.out.println("IME Handled");
			System.out.println(e);
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			System.out.println("AE Handled");
			System.out.println(e);
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("Exception Handled");
		}
		System.out.println("Welcome");
		
	}

}
