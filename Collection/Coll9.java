package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
class Book11{
	int bookid;
	String name;
	
	public Book11(int bookid,String name){
		this.bookid=bookid;
		this.name=name;
	}
	public String toString(){
		return "Book Id:"+bookid+" Book Name:"+name;
	}
}
public class Coll9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Book11> h=new HashMap<Integer,Book11>();
		
		Book11 b1=new Book11(1,"Yayati");
		Book11 b2=new Book11(2,"Wings of fire");
		Book11 b3=new Book11(3,"Krishnakath");
		Book11 b4=new Book11(4,"Shymchi Aai");
		Book11 b5=new Book11(5,"Discovery of India");
		h.put(1,b1);
		h.put(2,b2);
		h.put(3,b3);
		h.put(4,b4);
		h.put(5,b5);
		
		System.out.println("Key Pairs");
		System.out.println(h);
		Book11 b6=new Book11(6,"Chhava"); 
		h.put(6,b6);
		System.out.println("Key Pairs");
		System.out.println(h);
		
		
		System.out.println("Contains Key:"+h.containsKey(1));
		
		System.out.println(h.keySet());
		
		System.out.println("Using Set:");
		Set<Integer> s=h.keySet();
		for(int i:s){
			System.out.println(i);
		}
		System.out.println(h.values());
		
		System.out.println("Using Collection:");
		System.out.println("Values are:");
		Collection<Book11> s1=h.values();
		for(Book11 b:s1){
			System.out.println(b);
		}
		
		
		
	}

}
