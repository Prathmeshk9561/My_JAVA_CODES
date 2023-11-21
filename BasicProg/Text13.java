import java.util.Scanner;

public class Text13 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter any no:");
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		String s=a>b && a>c?(a+" is Greater No "): b>c?(b+" is Greater No"):(c+ " is Greater no");
		
		System.out.println(s);
	}

}
