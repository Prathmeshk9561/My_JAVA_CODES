package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileInputStream f1=new FileInputStream("a1.txt");
			System.out.println("Data in File:");
			int i=0;
			while((i=f1.read())!=-1){
				System.out.println((char)i);
			}	
			f1.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not Opened");
		}
		
	}

}
