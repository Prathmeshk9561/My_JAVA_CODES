package Exception;

import java.io.IOException;
import java.util.Scanner;
class MarksException extends Exception{
	
	public String toString(){
		return "Marks are between 0-100";
	}
}
public class Ex17 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3,total;
		double per;
		
		System.out.println("Enter marks of 3 subject:");
		
		Scanner sc=new Scanner(System.in);
		try{
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		
		if(s1>100 ||s2>100 ||s3>100)
				throw new MarksException();
		if(s1<0 ||s2<0 ||s3<0)
			throw new MarksException();
	
		total=s1+s2+s3;
		per=total/3.0;
		
		System.out.println("Total:"+total);
		System.out.println("Percentage:"+per);
		}
		catch(MarksException e){
			System.out.println(e);
		}
	}
	
}
