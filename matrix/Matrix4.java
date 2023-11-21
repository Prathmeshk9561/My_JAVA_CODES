package matrix;

import java.util.Arrays;
import java.util.Scanner;
//WAP to accept nxm nos for matrix and display it
public class Matrix4 {

	public static void main(String[] args) {
		
		int r,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Rows:");
		r=sc.nextInt();
		System.out.println("How many Columns:");
		c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter nos for matrix:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a[0].length;j++){
				
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
		}
		System.out.println("Nos are:");
		
		System.out.println(Arrays.deepToString(a));
		
	}

}
