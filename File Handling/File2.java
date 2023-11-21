package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream f1=new FileOutputStream("a1.txt",true);
			f1.write(65);
			f1.write('A');
			f1.write('C');
			
			byte b[]={70,71,72,73};
			
			f1.write(b);
			
			byte c[]={97,98,99,100,100,101};
			
			f1.write(c,2,3);
			f1.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not Opened");
		}
		
	}

}
