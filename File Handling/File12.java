package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class File12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="Welcome to File Handling Program";
		try {
			Writer p1=new FileWriter("C:\\city\\p3.txt");
			System.out.println("Hello");
			p1.write(s);
			p1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		char c[]=new char[100];
		try {
			Reader r1=new FileReader("C:\\city\\p3.txt");
			System.out.println("Data in File:");
			r1.read(c);
			String s1=new String(c);
			System.out.println(s1);
			r1.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
