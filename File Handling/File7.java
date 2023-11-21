package File;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int roll;
		String name;
		double per;
		
		try {
			FileOutputStream f1=new FileOutputStream("C:\\city\\a2.text");
			DataOutputStream d1=new DataOutputStream(f1);
			Scanner sc=new Scanner(System.in);
			
			System.out.println("How many Record:");
			int n=sc.nextInt();
			
			System.out.println("Enter Record "+n);
			for(int i=0;i<n;i++){
				System.out.println("Enter Record:"+(i+1));
				System.out.println("Enter roll no:");
				roll=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter name:");
				name=sc.nextLine();
				System.out.println("Enter percentage:");
				per=sc.nextDouble();
				
				d1.writeInt(roll);
				d1.writeUTF(name);
				d1.writeDouble(per);
				
			}
			d1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
		}
		
		FileInputStream I1=new FileInputStream("C:\\city\\a2.text");
		DataInputStream d2=new DataInputStream(I1);
		try{
		while(true){
			roll=d2.readInt();
			name=d2.readUTF();
			per=d2.readDouble();
			
			System.out.println("Roll No:"+roll);
			System.out.println("Name:"+name);
			System.out.println("Percentage:"+per);
			
		}
		}
		catch(EOFException ex){
			
		}
		d2.close();
		
	}

}
