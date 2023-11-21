import java.io.IOException;
import java.util.Scanner;

public class Text6 {

	public static void main(String[] args) throws IOException {
		char c;
		System.out.println("Enter any character:");
		
		c=(char)System.in.read();
			System.out.println("Character is:"+c);
	if(Character.isAlphabetic(c))
		System.out.println(c+" is Alphabet");
	else if(Character.isDigit(c))
		System.out.println(c+"is Digit");
	else
		System.out.println(c+" is Special Character");
	if(Character.isLowerCase(c))
		System.out.println(c+" is Lowercase Character");
	if(Character.isUpperCase(c))
		System.out.println(c+" is Uppercase Character");
	}

}
