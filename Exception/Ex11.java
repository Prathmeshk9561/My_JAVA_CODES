package Exception;

import java.io.IOException;

public class Ex11 {
	static void f1(){
		f2();
	}
 static void f2(){
	
			char ch;
			System.out.println("Enter any character:");
			try{
			ch=(char)System.in.read();
			System.out.println("Character is:"+ch);
			}catch(IOException e){
				System.out.println("IO Exception Handlied");
			}
 }
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
			f1();
			
	}

}
