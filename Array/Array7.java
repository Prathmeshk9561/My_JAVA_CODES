package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// Search an element within Array
		int a[]=new int[5];
		int i,n;
		System.out.println("Enter five nos:");
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Nos are:");
		System.out.println(Arrays.toString(a));
		
		System.out.println("Enter any no:");
		n=sc.nextInt();
		int f=0;
		for(int k : a){
			if(k==n){
				f++;
			}
		}
		if(f==0)
			System.out.println(n +" is not Present");
		else
			System.out.println(n +" is Present"+ f+" time");
			
		System.out.println("Enter any no:");
		n=sc.nextInt();
		Arrays.sort(a);
		System.out.println("Sorted Array:"+Arrays.toString(a));
		int p=Arrays.binarySearch(a, n);
		System.out.println("Position of No:"+p);
		
	}

}
