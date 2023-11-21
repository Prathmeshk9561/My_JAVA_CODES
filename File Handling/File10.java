package File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File10 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream f1=new FileOutputStream("C:\\city\\p1.txt");
			BufferedOutputStream bout=new BufferedOutputStream(f1);
			String s="Welcome to Java Programming";	
			bout.write(s.getBytes());
			bout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream f2=new FileInputStream("C:\\city\\p1.txt");
		BufferedInputStream bin=new BufferedInputStream(f2);
		int i;
		while((i=bin.read())!=-1)
		{
			System.out.print((char)i);
		}
				
		bin.close();
	}

}
