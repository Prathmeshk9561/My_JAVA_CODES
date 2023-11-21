package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix6 {

	public static void main(String[] args) {
		int [][]a=new int[][]{{10,20,30},{40,50,60}};
		
		
		for(int i=0;i<a.length;i++){
	
			for(int j=0;j<a[0].length;j++){
				
				System.out.println(a[i][j]+" ");
				}
			System.out.println();
		}
		System.out.println("Nos are:");
		
		System.out.println(Arrays.deepToString(a));
		
	}

}
