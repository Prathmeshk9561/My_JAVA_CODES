package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

class Book{
	int Bookid;
	String name;
	int price;
	
	Book(int Bookid,String name,int price){
		this.Bookid=Bookid;
		this.name=name;
		this.price=price;
	}
	Book(){}
	public String toString(){
		return "\nBook Id:"+Bookid +
				"\nName:"+name+"\nPrice"+price;
	}
}
public class Coll5 {
	static Book []arr=new Book[3];
	static void getdata(){
		arr[0]=new Book(1,"Discovery",500);
		arr[1]=new Book(2,"Satuache Prayog",300);
		arr[2]=new Book(3,"Shyamchi Aai",400);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Book> h1=new LinkedHashSet<Book>();
		getdata();
		
		System.out.println("Insert Data in hash Set");
		for(int i=0;i<3;i++){
			h1.add(arr[i]);
		}
		
		System.out.println("Data in HashSet");
		for(Book t:h1){
			System.out.println(t);
		}
		Book b1=new Book(1,"Discovery",500);
		h1.add(b1);
		
		System.out.println(b1);
		
		System.out.println("After Adding new Data:");
		h1.add(arr[1]);
		System.out.println(h1);
		
		HashSet<Integer> h2=new HashSet<Integer>();
		h2.add(100);
		h2.add(200);
		h2.add(300);
		h2.add(400);
		
		System.out.println(h2);
		
		h2.add(500);
		h2.add(300);
		
		System.out.println(h2);
		
		System.out.println("Using Iterator:");
		Iterator<Book> itr1=h1.iterator();
		while(itr1.hasNext()){
			Book t=itr1.next();
			System.out.println(t);
		}
		
	}
}
