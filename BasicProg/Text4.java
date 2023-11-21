import java.io.IOException;
import java.util.Scanner;

public class Text4 {

	public static void main(String[] args) throws IOException {
		char c;
		System.out.println("Enter any character:");
		
		c=(char)System.in.read();
			System.out.println("Character is:"+c);
	if(c>=65 && c<=90)
		System.out.println(c+" is Character");
	else if(c>=97 && c<=122)
		System.out.println(c+" is Character");
	else if(c>=48 && c<=57)	
		System.out.println(c+"is Digit");
	else
		System.out.println(c+" is Specail Character");
	}

}
