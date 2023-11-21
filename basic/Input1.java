package basic;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		// Get string
		Integer a;
		Double p;
		Float q;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no:");
		a=sc.nextInt();
		
		System.out.println("Enter any Float no:");
		q=sc.nextFloat();
		
		System.out.println("Enter any Double no:");
		p=sc.nextDouble();
		
		System.out.println("Enter any String:");
		s=sc.next();
		
		
		
		
		System.out.println("Integer No:"+a);
		System.out.println("Float:"+q);
		System.out.println("Double No:"+p);
		System.out.println("String:"+s);
		
		}

}
