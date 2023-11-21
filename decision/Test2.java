package decision;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter any two nos:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		
		if(a%2==0)
				System.out.println(a+" is Even no");
		else
			System.out.println(a+" is Odd no");
	}

}
