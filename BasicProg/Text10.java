import java.io.IOException;
import java.util.Scanner;

public class Text10 {

	public static void main(String[] args) throws IOException {
	
	int a;
	System.out.println("Enter any no:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	
	System.out.println("Sqaure:"+(a*a));
	System.out.println("Sqaure:"+Math.pow(a,2));
	System.out.println("Sqaure:"+(a*a));
	System.out.println("Cube:"+Math.pow(a,3));

	System.out.println("Square Root:"+ Math.sqrt(a));
	System.out.println("Cube Root:"+ Math.cbrt(a));
	
	
	System.out.println(a);
	System.out.println("No is:"+a);
	System.out.println("1"+2+2);
	System.out.println(2+2+"1");
	}

}
