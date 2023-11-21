package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix5 {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nos for matrix:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++){
			int s=0;
			for(int j=0;j<a[0].length;j++){
				
				System.out.println(a[j][i]+" ");
				s=s+a[j][i];
			}
			System.out.println();
			System.out.println("Addition of matrix:"+s);
		}
		System.out.println("Nos are:");
		
		System.out.println(Arrays.deepToString(a));
		
	}

}
