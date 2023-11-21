package Exception;

import java.io.IOException;

public class Ex10 {
	static char ch;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
		System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
