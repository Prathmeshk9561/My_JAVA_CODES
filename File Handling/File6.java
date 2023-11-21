package File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			FileOutputStream f1=new FileOutputStream("C:\\city\\a1.txt");
				
				String s="Welcome to Java Program";
				f1.write(s.getBytes());
				f1.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("File not open");
			}
			
			
			try{    
			    FileInputStream fin=new FileInputStream("C:\\city\\a1.txt");    
			        
			    int i;    
			    while((i=fin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			      
			    fin.close();    
			  }catch(Exception e){System.out.println(e);}    
	}

}
