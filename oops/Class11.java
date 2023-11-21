package oops;

import java.util.Scanner;

public class Class11 {
		static int fact(int x){
			int fa;
			if(x==1)
					return 1;
			else{
				fa=x*fact(x-1);
				return fa;
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,f;
		System.out.println("Enter any no:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		f=fact(a);
		System.out.println("Factporial:"+f);
		
		
	}

}
