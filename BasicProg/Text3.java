import java.util.Scanner;

public class Text3 {

	public static void main(String[] args) {
		char c;
		System.out.println("Enter any character:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		c=s.charAt(0);
		System.out.println("Character is:"+c);
	}

}
