package string;

import java.util.Scanner;
//Title case
public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		System.out.println("Enter any string:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		String y="";
		s=s.toLowerCase();
		char ch=s.charAt(0);
		
		y=y+Character.toUpperCase(ch);
		
		for(int i=0;i<s.length();i++){
			ch=s.charAt(i);
			if(ch==' '){
				ch=s.charAt(i+1);
				y=y+" "+Character.toUpperCase(ch);

			}
		}
		
		System.out.println("String is:"+y);

	}

}
