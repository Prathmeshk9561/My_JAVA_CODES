package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		// Array
		int a[]=new int[5];
		int i,min,max;
		System.out.println("Enter five nos:");
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Nos are:");
		System.out.println(Arrays.toString(a));
		int m=a[0];
		int n=a[0];
		for(int k : a){
			if(k<n){
				n=k;
			}
			if(k>m){
				m=k;
			}
				
		}
			System.out.println("Largest No:"+m);
			System.out.println("Lowest No:"+n);
	}

}
