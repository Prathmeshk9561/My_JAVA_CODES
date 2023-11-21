package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class File13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="Welcome to File Handling Program";
		try {
			FileOutputStream f1=new FileOutputStream("C:\\city\\p3.txt");
			OutputStreamWriter p1=new OutputStreamWriter(f1);
			System.out.println("Hello");
			p1.write(s);
			p1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		char c[]=new char[100];
		try {
			FileInputStream f2=new FileInputStream("C:\\city\\p3.txt");
			InputStreamReader r1=new InputStreamReader(f2);
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
