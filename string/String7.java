package string;

import java.util.Scanner;
//Title case
public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		System.out.println("Enter any string:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("String is:"+s);
		s=s.toLowerCase();
		String t="";
		char ch=s.charAt(0);
		t=t+Character.toUpperCase(ch);
		
		for(int i=1;i<s.length();i++){
			ch=s.charAt(i);
			if(ch==' '){
				
				t=t+ch;
				i++;
				ch=s.charAt(i);
				t=t+Character.toUpperCase(ch);
				
			}
			else
			{
				t=t+ch;
			}
		}
		
		System.out.println(t);

	}

}
