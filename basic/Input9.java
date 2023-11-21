package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input9 {

	public static void main(String[] args) {
		// Get string
		int a=10,b=20,c=30;
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println(a<b && a<c);
		System.out.println(a<b && a>c);
		
		System.out.println(a<b || a<c);
		System.out.println(a<b || a>c);
		
		System.out.println(!(a<b));
		
		System.out.println(a+=5);
		System.out.println(a-=5);
		System.out.println(a*=5);
		System.out.println(a/=5);
		System.out.println(a%=5);
	}
	

}
