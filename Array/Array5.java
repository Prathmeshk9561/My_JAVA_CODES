package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// Array
		int a[]=new int[5];
		int i;
		System.out.println("Enter five nos:");
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Nos are:");
		System.out.println(Arrays.toString(a));
		int sum;
		sum=0;
		for(int k :a){
			sum=sum+k;
		}
			System.out.println("Sum of Array:"+sum);
	}

}
