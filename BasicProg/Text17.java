import java.util.Scanner;

public class Text17 {

	public static void main(String[] args) {
		int a,f;
		System.out.println("Enter any no:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		f=1;
		while(a>=1){
			f=f*a;
			a--;
		}
		System.out.println("Factorial:"+f);
		
	}

}
