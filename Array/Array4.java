package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		int n,i,temp,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Nos for array:");
		n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter nos "+n+":");
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
	
		}
		System.out.println("Nos are:"+Arrays.toString(a));
		for(i=0,j=a.length-1;i<j;j--,i++){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
	
		}
System.out.println("Reverse Array:"+Arrays.toString(a));	
Arrays.sort(a);
System.out.println("Sorted Array:"+Arrays.toString(a));
	}

}
