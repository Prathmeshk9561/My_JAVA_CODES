package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Coll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println("Using toString");
		System.out.println("Nos are:");
		System.out.println(a1);
		
		System.out.println("Using for-each loop");
		for(int a:a1){
			System.out.println(a);
		}
		System.out.println("Using iterator()");
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext()){
			int n;
			n=itr.next();
			System.out.println(n);
		}
}

	
}
