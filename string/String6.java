package string;

import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		System.out.println("Enter any string:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("String is:"+s);
		
		int l=s.length();
		l--;
		String t="";
		while(l>=0){
			char ch=s.charAt(l);
			t=t+ch;
			l--;
		}
		if(s.equals(t))
			System.out.println("String is Palindrom");
		else
			System.out.println("String is not Palindrom");
		
		}

}
