package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class file4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream f1=new FileOutputStream("abc.txt",true);
			Scanner sc=new Scanner(System.in);
			
			String s;
			System.out.println("Enter data for file");
			while(sc.hasNext()){
				s=sc.nextLine();
				f1.write((s+"\r\n").getBytes());
			}
			
			f1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not Found");
		}
		FileInputStream f1=new FileInputStream("abc.txt");
		int i;
		System.out.println("Data in File:");
		while((i=f1.read())!=-1){
			System.out.print((char)i);
		}
		f1.close();
	}

}	
