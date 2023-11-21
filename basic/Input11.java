package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input11 {

	public static void main(String[] args) {
		// Get string
		int a=10,b=7;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		int c=a&b;
		System.out.println(c);
		System.out.println(Integer.toBinaryString(c));
		
		c=a|b;
		System.out.println(c);
		System.out.println(Integer.toBinaryString(c));
		
		c=a^b;
		System.out.println(c);
		System.out.println(Integer.toBinaryString(c));
		
		
		System.out.println(a<<2);
		System.out.println(Integer.toBinaryString(a<<2));
		
		System.out.println(a>>2);
		System.out.println(Integer.toBinaryString(a>>2));
		
		System.out.println(~a);
		System.out.println(Integer.toBinaryString(~a));
		}
	

}
