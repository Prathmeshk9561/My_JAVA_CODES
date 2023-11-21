package Exception;

import java.io.IOException;

public class Ex7 {
	static char ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any Character:");
		try{
		ch=(char)System.in.read();
		}
		catch(IOException e){
			System.out.println("Handled IO Exception");
		}
		System.out.println("Character is:"+ch);
		
	}

}
