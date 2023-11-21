package decision;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter any two nos:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a>b)
				System.out.println(a+" is Greater no");
		else
			System.out.println(b+" is Greater no");
	}

}
