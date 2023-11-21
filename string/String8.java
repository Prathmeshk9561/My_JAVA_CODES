package string;

import java.util.Scanner;
//Title case
public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		System.out.println("Enter any string:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("String is:"+s);
		s=s.toLowerCase();
		
		char ch=s.charAt(0);
		String t=new String();
		
		s=Character.toUpperCase(ch)+s.substring(1);
		
		System.out.println(s);
		for(int i=0;i<s.length();i++){
			ch=s.charAt(i);
			if(ch==' '){
				
				s=s.substring(0,i+1)+Character.toUpperCase(s.charAt(i+1))+s.substring(i+2);
			}
			
		}
		System.out.println(s);

	}

}
