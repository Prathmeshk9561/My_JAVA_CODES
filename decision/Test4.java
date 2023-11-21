package decision;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter any three nos:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c)
				System.out.println(a+" is Greater no");
		else if(b>c)
			System.out.println(b+" is Greater no");
		else
			System.out.println(c+" is Greater no");
	}

}
