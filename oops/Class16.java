package oops;

import java.util.Scanner;

public class Class16 {
		static void add(int x[]){
			for(int i=0;i<x.length;i++){
				x[i]=x[i]+5;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		System.out.println("Enter any five nos:");
	Scanner sc=new Scanner(System.in);
	
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}

	System.out.println("Nos are:");
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	add(a);
	System.out.println("Nos are:");
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	}

}
