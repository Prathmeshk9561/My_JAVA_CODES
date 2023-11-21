package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input7 {

	public static void main(String[] args) throws IOException{
		// Get string
		System.out.println("Enter any no");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		Integer a;
		a=Integer.parseInt(s);
		System.out.println("Integer No:"+a);
	
		System.out.println("Enter any Double no");
		s=sc.next();
		
		double p;
		p=Double.parseDouble(s);
		System.out.println("Double No:"+p);
	}
	

}
