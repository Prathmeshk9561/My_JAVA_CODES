package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("Enter Numerator:");
		a=sc.nextInt();
		System.out.println("Enter Denominator:");
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
		System.out.println("Welcome");
		
	}

	

}
