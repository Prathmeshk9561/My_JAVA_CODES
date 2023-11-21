package File;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int roll;
		String name;
		double per;
		
		System.out.println("How many record:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		try {
			FileOutputStream fout=new FileOutputStream("C:\\city\\p2.txt");
			DataOutputStream d1=new DataOutputStream(fout);
			
			System.out.println("Enter record "+n);
			for(int i=0;i<n;i++){
			System.out.println("Enter Roll No:");
			roll=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name:");
			name=sc.nextLine();
			System.out.println("Enter Percentage:");
			per=sc.nextDouble();
			
			d1.writeInt(roll);
			d1.writeUTF(name);
			d1.writeDouble(per);
			}
			d1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			FileInputStream fin=new FileInputStream("C:\\city\\p2.txt");
			DataInputStream d2=new DataInputStream(fin);
			
			System.out.println("Information in File:");
			try{
			while(true)
			{
				roll=d2.readInt();
				name=d2.readUTF();
				per=d2.readDouble();
				System.out.println("Roll no:"+roll);
				System.out.println("Name:"+name);
				System.out.println("Percenatge:"+per);
			}
			}
			catch(EOFException ex){}
			d2.close();
		}
		
	

}
