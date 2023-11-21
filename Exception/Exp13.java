package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3,total;
		float per;
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("Enter Marks of 3 Subject:");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		if(s1<0 || s2<0 ||s3<0)
			throw new ArithmeticException();
		if(s1>100 || s2>100 ||s3>100)
			throw new ArithmeticException();
		
		total=s1+s2+s3;
		per=(total/(float)3.0);
		System.out.println("Total:"+total);
		System.out.println("Percentage:"+per);
		
		}
		catch(InputMismatchException e){
			System.out.println("IME Handled");
			System.out.println(e);
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			System.out.println("AE Handled");
			System.out.println("You must enter marks between 0-100");
			System.out.println(e.getMessage());
		}
		System.out.println("Welcome");
		
	}

	private static void printStackTrace(InputMismatchException e) {
		// TODO Auto-generated method stub
		
	}

}
