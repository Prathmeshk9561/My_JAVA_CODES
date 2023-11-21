package decision;
//? :
//Condition?Expression1Expression2;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter any no:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
				
		String s=(a%2==0)?(a+" is Even no"):(a+" is Odd no");
	System.out.println(s);
	}
	

}
