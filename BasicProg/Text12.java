import java.util.Scanner;

public class Text12 {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter any no:");
		
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		
		String s=a>0?(a+" is +ve No "):(a+" is -ve No");
		
		System.out.println(s);
	}

}
