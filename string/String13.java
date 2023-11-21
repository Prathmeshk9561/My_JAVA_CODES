package string;

import java.util.Scanner;
import java.util.StringTokenizer;
//Title case
public class String13 {

	public static void main(String[] args) {
	StringTokenizer s=new StringTokenizer("City Computer karad");
	
	System.out.println(s.countTokens());
	
	while(s.hasMoreTokens()){
		System.out.println(s.nextToken());
	}
	
	StringTokenizer s1=new StringTokenizer("City,Computer,Institute,karad",",");
	
System.out.println(s.countTokens());
	
	while(s1.hasMoreTokens()){
		System.out.println(s1.nextToken());
	}
	
	}

}
