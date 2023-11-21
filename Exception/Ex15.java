package Exception;
 
import java.io.IOException;
import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a,b,c;
		try{
		System.out.println("Enter Numerator");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter Denominator");
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division:"+c);
		}
		
		finally{
			System.out.println("Finally Block Executed");
		}
		System.out.println("Welcome");
		
	}

}
