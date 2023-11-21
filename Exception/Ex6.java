package Exception;

import java.util.*;

public class Ex6 {

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
		finally{
			System.out.println("Finally Block Executed");
		}
		System.out.println("Welcome");
		
	}

}
