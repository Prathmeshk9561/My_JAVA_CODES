package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String s=sc.nextLine();
		
		s=s.toLowerCase();
		s=s.trim();
		
		String y="";
		StringTokenizer s1=new StringTokenizer(s);
		
		while(s1.hasMoreTokens()){
			String s2=s1.nextToken();
			y=y+Character.toUpperCase(s2.charAt(0))+s2.substring(1)+" ";
		}
		System.out.println("String in Propercase:"+y);
	}

}
