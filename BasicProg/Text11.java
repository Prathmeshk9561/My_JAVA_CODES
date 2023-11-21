import java.util.Scanner;

public class Text11 {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter any no:");
		
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		
		String s=a%2==0?(a+" is Even No "):(a+" is Odd No");
		
		System.out.println(s);
	}

}
