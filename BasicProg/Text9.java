import java.io.IOException;
import java.util.Scanner;

public class Text9 {

	public static void main(String[] args) throws IOException {
		int a,b,c;
		a=10;
		b=7;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		
		System.out.println(b);
		System.out.println(Integer.toBinaryString(b));
		
		c=a&b;
		System.out.println(c);
		System.out.println(Integer.toBinaryString(c));	
		
		c=a|b;
		System.out.println(c);
		System.out.println(Integer.toBinaryString(c));	
		
		c=a^b;
		System.out.println(c);
		System.out.println(Integer.toBinaryString(c));	
	
		a=10;
		
		System.out.println(a<<1);
		System.out.println(Integer.toBinaryString(a<<1));	
	
		System.out.println(a<<2);
		System.out.println(Integer.toBinaryString(a<<2));

		System.out.println(a>>1);
		System.out.println(Integer.toBinaryString(a>>1));	
	
		System.out.println(a>>2);
		System.out.println(Integer.toBinaryString(a>>2));
		
		a=10;
		System.out.println(a);
		System.out.println(~a);
		
		Text9 p=new Text9();
		System.out.println(p instanceof Text9);
		
		}

}
