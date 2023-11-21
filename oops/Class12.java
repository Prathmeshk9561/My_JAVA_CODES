package oops;

import java.util.Scanner;

public class Class12 {
		static int sod(int x){
			int b,s;
			if(x==0)
					return 0;
			else{
				b=x%10;
				s=b+sod(x/10);
				return s;
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum;
		System.out.println("Enter any no:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		sum=sod(a);
		System.out.println("Sum of Digit:"+sum);
		
		
	}

}
