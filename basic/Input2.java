package basic;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		// Get string
		char ch;
		String s;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any Character:");
		s=sc.next();
		
		ch=s.charAt(2);
		System.out.println("Character:"+ch);
		
	}

}
