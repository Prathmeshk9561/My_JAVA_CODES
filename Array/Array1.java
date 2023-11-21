package Array;

import java.util.Arrays;
import java.util.Scanner;

//WAP to initialise and display array
public class Array1 {

	public static void main(String[] args) {
		int a[]=new int [5];
		System.out.println("Enter any five nos:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();

		}
		
		System.out.println("Nos are:");
		for(int i=0;i<5;i++){
			System.out.println(a[i]);

		}
		System.out.println("Nos are:"+Arrays.toString(a));
		}

	}


