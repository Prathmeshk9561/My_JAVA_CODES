package Exception;

import java.io.IOException;
import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a,b,c;
		try{
		System.out.println("Enter Numerator");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter Denominator");
		b=sc.nextInt();
		if(b==0)
				throw new ArithmeticException();
		c=a/b;
		System.out.println("Division:"+c);
		}
		catch(ArithmeticException e){
			System.out.println("Denomitor is must be non zero");
		}
		
		System.out.println("Welcome");
		
	}

}
