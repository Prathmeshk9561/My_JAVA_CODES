package decision;
//? :
//Condition?Expression1Expression2;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter any two nos:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		String s=(a>b)?(a+" is Greater no"):(b+" is Greater no");
	System.out.println(s);
	}
	

}
