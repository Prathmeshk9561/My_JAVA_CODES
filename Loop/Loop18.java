package Loop;

import java.util.ArrayList;
import java.util.Scanner;

public class Loop18 {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter any String:");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		char ch;
		int c,v,w,d;
		c=0; v=0; w=1; d=0;
		for(int i=0; i<s.length();i++){
			ch=s.charAt(i);
			if(Character.isAlphabetic(ch)){
				c++;
			}
			else if(Character.isDigit(ch)){
				d++;
			}
		
			
				
		}
		
	}	
	}
