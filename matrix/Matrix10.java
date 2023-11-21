package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix10 {

	public static void main(String[] args) {
		int [][]a=new int[2][];
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Element in first:");
		int c=sc.nextInt();
		a[0]=new int[c];
		
		System.out.println("How many Element in Second:");
		c=sc.nextInt();
		a[1]=new int[c];
		System.out.println("Enter nos:");
		for(int i=0;i<a.length;i++){
	
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
				
				}
			
		}
		
		
		for(int i=0;i<a.length;i++){
			int s=0;
			for(int j=0;j<a[i].length;j++){
				s=s+a[i][j];
				System.out.print(a[i][j]+" ");
				
				}
			System.out.println();
			System.out.println("Addition:"+s);
		}
		
		System.out.println("Nos are:");
		
		System.out.println(Arrays.deepToString(a));
		
	}

}
