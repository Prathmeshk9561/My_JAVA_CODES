package Collection;

import java.util.Iterator;
import java.util.TreeSet;

class Book1 implements Comparable{
	int bookid;
	String name;
	
	public Book1(int bookid,String name){
		this.bookid=bookid;
		this.name=name;
	}
	
	public String toString(){
		return "Book Id:"+bookid +" Book Name:"+name;
	}
	public int compareTo(Object o){
		Book1 t=(Book1)o;
		if(this.bookid==t.bookid)
				return 0;
		else if(this.bookid<t.bookid)
				return -1;
		else
			return 1;
	
	}

	
}
public class Coll7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 b1=new Book1(105,"Satyache Prayog");
		Book1 b2=new Book1(101,"Shaymachi Aai");
		Book1 b3=new Book1(103,"Wings of Fire");
		Book1 b4=new Book1(102,"Krishna Kath");
		Book1 b5=new Book1(104,"Yayati");
		
		TreeSet<Book1> t1=new TreeSet<Book1>();
		t1.add(b1);
		t1.add(b2);
		t1.add(b3);
		t1.add(b4);
		t1.add(b5);
		System.out.println(t1);
		
		System.out.println("Using Iterator:");
		Iterator<Book1> itr=t1.iterator();
		while(itr.hasNext()){
			Book1 t=itr.next();
			System.out.println(t);
		}
		
	}

}
