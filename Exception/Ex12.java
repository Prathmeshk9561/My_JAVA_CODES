package Exception;

import java.io.IOException;

public class Ex12 {
	static void f1() throws IOException{
		f2();
	}
 static void f2() throws IOException{
	
			char ch;
			System.out.println("Enter any character:");
			
			ch=(char)System.in.read();
			System.out.println("Character is:"+ch);
			
 }
	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		
		f1();
	}

}
