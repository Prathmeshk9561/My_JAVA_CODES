package string;

import java.util.Scanner;
//Title case
public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		System.out.println("Enter any string:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		String y="";
		char ch;
		
		for(int i=0;i<s.length();i++){
			ch=s.charAt(i);
			System.out.println(s);
			s=s.substring(1)+s.charAt(0);
		}
		


	}

}
