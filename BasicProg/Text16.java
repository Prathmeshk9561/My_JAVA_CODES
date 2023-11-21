import java.util.Scanner;

public class Text16 {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter any no:");
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		switch(a){
		case 1:
				System.out.println("One");
				break;
		case 2:
			System.out.println("Two");
			break;				
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Wrong No");
			break;
		}
		

	}

}
