package Collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Coll13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> d1=new ArrayDeque<Integer>();
		d1.push(10);
		d1.push(20);
		d1.push(30);
		d1.push(40);
		d1.push(50);
		
		System.out.println("Elements are:"+ d1);
		System.out.println(d1.contains(10));
		
		System.out.println(d1.isEmpty());
		d1.addFirst(5);
		System.out.println("Elements After adding First:"+d1);
		d1.addLast(7);
		
		System.out.println("Size of Queue:"+d1.size());
		
		Iterator<Integer> itr=d1.iterator();
		
		System.out.println("Nos are:");
		while(itr.hasNext()){
			Integer n=itr.next();
			System.out.println(n);
		}
		System.out.println("Elements After adding Last:"+d1);
		while(d1.peek()!=null){
			System.out.println("Pop:"+d1.pop());
		}
		
		System.out.println(d1.isEmpty());
		
	}

}
