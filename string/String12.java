package string;

import java.util.Scanner;
//Title case
public class String12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer("City");
		
		System.out.println(s1);
		System.out.println(s2);

		s2.append("Computer");
		System.out.println(s2);
		
		s2.insert(4, "Java");
		System.out.println(s2);
		
		s2.delete(4,8);
		System.out.println(s2);
		
		System.out.println(s2.length());
		
		s2.setLength(4);
		System.out.println(s2);
		
		s2.insert(4, "Computer Institute");
		System.out.println(s2);
		
		s2.replace(0,4," Perfect");
		System.out.println(s2);
		
		System.out.println(s2.length());
		String s3=s2.toString();
		System.out.println(s3);
				
		s2.delete(8,26);
		System.out.println(s2);
		System.out.println(s2.capacity());
		
		s2.trimToSize();
		System.out.println(s2.capacity());
		System.out.println(s1.capacity());
	}

}
