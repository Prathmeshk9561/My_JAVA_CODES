package File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			FileOutputStream f1=new FileOutputStream("C:\\city\\a1.txt");
			BufferedOutputStream bout=new BufferedOutputStream(f1);
				
				String s="Welcome to Java Program";
				bout.write(s.getBytes());
				bout.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("File not open");
			}
			
			
			try{    
			    FileInputStream fin=new FileInputStream("C:\\city\\a1.txt");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
			  }catch(Exception e){System.out.println(e);}    
	}

}
