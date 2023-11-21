package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix7 {

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
		System.out.println("Nos are:");
		
		System.out.println(Arrays.deepToString(a));
		
	}

}
