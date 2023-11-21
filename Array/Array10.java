package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		// Search an element within Array
		int a[]=new int[5];
		int i,j,temp,n;
		System.out.println("Enter five nos:");
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Nos are:"+Arrays.toString(a));
		
		for(i=0;i<a.length-1;i++){
			for(j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	System.out.println("Sorted Array:"+Arrays.toString(a));
	}

}
