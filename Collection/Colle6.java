package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
class Book{
	int bookid;
	String name;
	int pages;
	
	public Book(int bookid,String name,int pages){
		this.bookid=bookid;
		this.name=name;
		this.pages=pages;
	}
	public String toString(){
		return "\nBook ID:"+bookid+"\nBook Name"+ name+
				"\n Pages:"+pages;
	}
}
public class Colle6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Book> hs=new LinkedHashSet<Book>();
		Book b1=new Book(101,"Satyache Proyog",100);
		Book b2=new Book(102,"Shyamchi Aai",150);
		Book b3=new Book(103,"Yayati",200);
		
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		
		System.out.println(hs);
		System.out.println("Using toString Method");
		Book b4=new Book(101,"Satyache Proyog",100);
		System.out.println(hs);
		
		hs.add(b3);
		System.out.println(hs);
				
		}

}
