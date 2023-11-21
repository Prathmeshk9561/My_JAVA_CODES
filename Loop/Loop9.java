package Loop;

import java.util.Scanner;

public class Loop9 {

	public static void main(String[] args) {
		int a,f;
		System.out.println("Enter Any No:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		f=1;
		do{
			f=f*a;
			a--;
		}
		while(a>=1);
		System.out.println("Factorial:"+f);
		
	}

}
