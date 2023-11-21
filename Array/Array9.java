package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array9 {

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
		Arrays.sort(a);
		for(int k :a){
			if(k%2==1){
				System.out.print(k+" ");
			}
			
		}
		System.out.println();
		for(i=a.length-1;i>=0;i--){
			if(a[i]%2==0){
				System.out.print(a[i]+" ");
			}
			
		}
		
	
	}

}
