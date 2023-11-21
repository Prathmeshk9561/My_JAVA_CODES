package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;
class Book1 implements Comparable{
	int bookid;
	String name;
	int pages;
	
	public Book1(int bookid,String name,int pages){
		this.bookid=bookid;
		this.name=name;
		this.pages=pages;
	}
	public String toString(){
		return "\nBook ID:"+bookid+"\nBook Name"+ name+
				"\n Pages:"+pages;
	}
	public int compareTo(Object o){
		Book1 b1=(Book1)o;
		  if(this.bookid==b1.bookid)
		 
				return 0;
		else if(this.bookid<b1.bookid)
				return -1;
		else
			return 1;
	}
}
public class Colle8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Book1> ts=new TreeSet<Book1>();
		Book1 b1=new Book1(101,"Satyache Proyog",100);
		Book1 b2=new Book1(102,"Shyamchi Aai",150);
		Book1 b3=new Book1(103,"Yayati",200);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		
		System.out.println(ts);
		
		
		
		
	}

}
