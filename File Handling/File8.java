package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class File8 {
	static String s="Welcome to Java Progam";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    try {
            // Creates a Writer using FileWriter
	    	Writer output = new FileWriter("C:\\city\\xyz.txt");
            System.out.println("hello");

            // Writes string to the file
            output.write(s);
            System.out.println("hello");
            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        
        }

	    try {
	    	Reader input=new FileReader("c:\\city\\xyz.txt");
			char s[]=new char[100];
			
			input.read(s);
			String str=new String(s);
			System.out.println("Data in String:"+str);
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
}
