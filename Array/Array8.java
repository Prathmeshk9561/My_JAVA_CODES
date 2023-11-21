package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array8 {

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
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		System.out.println("Enter any no:");
		n=sc.nextInt();
		int f=Arrays.binarySearch(a,n);
		
		System.out.println(n+" is present at position "+f);
	}

}
