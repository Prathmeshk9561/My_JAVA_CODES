package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) throws IOException{
		// Get string
		InputStreamReader s=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(s);
		char ch;
		System.out.println("Enter any Character:");
		ch=(char)br.read();
		
		System.out.println("Character:"+ch);
		
	}

}
