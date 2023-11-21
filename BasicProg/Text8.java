import java.io.IOException;
import java.util.Scanner;

public class Text8 {

	public static void main(String[] args) throws IOException {
		int a,b,c;
			a=20; b=10;
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
			
			System.out.println(a<b);
			System.out.println(a>b);
			System.out.println(a<=b);
			System.out.println(a>=b);
			System.out.println(a==b);
			System.out.println(a!=b);
			System.out.println(a=b);
			
			a=10; b=20; c=30;
			System.out.println(a<b && a<c);
			System.out.println(b<a && a<c);
			System.out.println(a<b && a>c);
			System.out.println(a>b && a>c);
			
			System.out.println(a<b || a<c);
			System.out.println(b<a || a<c);
			System.out.println(a<b || a>c);
			System.out.println(a>b || a>c);
			
			a=10;
			System.out.println(a+=5);
			System.out.println(a-=5);
			System.out.println(a*=5);
			System.out.println(a/=5);
			
					}

}
