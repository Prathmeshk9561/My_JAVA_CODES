package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nos for matrix:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		

		System.out.println("Nos are:");
		for(int k[]: a){
			int s=0;
			for(int m: k){
				s=s+m;
				System.out.print(m+" ");
			}
			
			System.out.println();
			System.out.println("Addition of matrix:"+s);
		}
		System.out.println(Arrays.deepToString(a));
	
	}

}
