package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class File9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String data = "Computer is an electonic device";

			    try {
			      // Creates a FileOutputStream
			      FileOutputStream file = new FileOutputStream("C:\\city\\x1.txt");

			      // Creates an OutputStreamWriter
			      OutputStreamWriter output = new OutputStreamWriter(file);

			      // Writes string to the file
			      output.write(data);

			      // Closes the writer
			      output.close();
			    }

			    catch (Exception e) {
			      e.getStackTrace();
			    }
			    
			    try {
				      // Creates a FileOutputStream
				      FileInputStream file = new FileInputStream("C:\\city\\x1.txt");

				      // Creates an OutputStreamWriter
				      InputStreamReader input = new InputStreamReader(file);
				      char s[]=new char[100];
				      // Writes string to the file
				      System.out.println("Size of File:"+input.read());
				      input.read(s);
				      String s1=new String(s);
				      System.out.println("Data in File:"+s1);
				      // Closes the writer
				      input.close();
				    }

				    catch (Exception e) {
				      e.getStackTrace();
				    }
	}

}
