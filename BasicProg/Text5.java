import java.io.IOException;
import java.util.Scanner;

public class Text5 {

	public static void main(String[] args) throws IOException {
		char c;
		System.out.println("Enter any character:");
		
		c=(char)System.in.read();
			System.out.println("Character is:"+c);
	if(c>='A' && c<='Z')
		System.out.println(c+" is Character");
	else if(c>='a' && c<='z')
		System.out.println(c+" is Character");
	else if(c>='0' && c<='9')
		System.out.println(c+"is Digit");
	else
		System.out.println(c+" is Specail Character");
	}

}
