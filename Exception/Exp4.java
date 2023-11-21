package Exception;

import java.io.IOException;

public class Exp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter any Character:");
		try{
		ch=(char)System.in.read();
		
		System.out.println("Chaarcter is:"+ch);
		}
		catch(IOException e){
			System.out.println("IO Exception handle");
		}
	}

}
