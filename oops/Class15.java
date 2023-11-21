package oops;

import java.util.Scanner;

public class Class15 {
		static void swap(int x,int y){
			int temp;
			temp=x;
			x=y;
			y=temp;
			System.out.println("In swapping Function:");
			System.out.println("A:"+x);
			System.out.println("B:"+y);
				
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter any two nos:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		
		swap(a,b);
		System.out.println("After swapping:");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		
		
	}

}
