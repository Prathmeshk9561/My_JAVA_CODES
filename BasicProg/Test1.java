import java.util.Scanner;

public class Test1 {
	public static void main(String [] args){
		int a,b;
		Integer c;
		System.out.println("Enter any two nos:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=a+b;
		System.out.println("Addition:"+c);
	}
}