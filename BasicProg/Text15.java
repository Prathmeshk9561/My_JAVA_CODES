import java.io.IOException;
import java.util.Scanner;

public class Text15 {

	public static void main(String[] args) throws IOException {
		char ch;
		System.out.println("Enter any Character:");
		
		ch=(char)System.in.read();
		if(ch>='A' && ch<='Z')
			System.out.println(ch+" is Alphabet");
		else if(ch>='a' && ch<='z')
			System.out.println(ch+" is Alphabet");
		else if(ch>='0' && ch<='9')
			System.out.println(ch+" is Digit");
		else
			System.out.println(ch+" is Special Character");
		
		
		if(ch>=65 && ch<=90)
			System.out.println(ch+" is Alphabet");
		else if(ch>=97 && ch<=122)
			System.out.println(ch+" is Alphabet");
		else if(ch>=48 &&- ch<=57)
			System.out.println(ch+" is Digit");
		else
			System.out.println(ch+" is Special Character");
		
	
		if(Character.isAlphabetic(ch))
			System.out.println(ch+" is Alphabet");
		else if(Character.isDigit(ch))
			System.out.println(ch+" is Digit");
		else
			System.out.println(ch+" is Special Character");
		
		
		if(Character.isUpperCase(ch))
			System.out.println(ch+" is Uppercase Alphabet");
		else if(Character.isLowerCase(ch))
			System.out.println(ch+" is Lowercase Alphabet");
		else if(Character.isDigit(ch))
			System.out.println(ch+" is Digit");
		else	
			System.out.println(ch+" is Special Character");
		
	}

}
