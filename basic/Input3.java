package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		// Get string
		InputStreamReader s=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(s);
		String str="";
		try{
		System.out.println("Enter any String:");
		str=br.readLine();
		}
		catch(IOException e){
			String p=e.getMessage();
			System.out.println(p);
		}
		System.out.println("String:"+str);
		
	}

}
