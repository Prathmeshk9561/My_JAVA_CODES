package Array;

import java.util.Arrays;
import java.util.Scanner;

//WAP to n nos for an array and make addition of it
public class Array3 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Nos for array:");
		n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter nos "+n+":");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
	
		}
		System.out.println("Nos are:"+Arrays.toString(a));
		int sum=0;
		for(int k: a){
			sum=sum+k;
		}
		System.out.println("Addition of Array:"+sum);
	}
	
	}


