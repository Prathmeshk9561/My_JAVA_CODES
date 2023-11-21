package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Coll14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Vector<Integer> t=new Vector<Integer>();
		t.addElement(5);
		t.addElement(10);
		t.addElement(15);
		t.addElement(20);
		t.addElement(30);
		t.addElement(40);
		
		System.out.println("Nos using toString Method:");
		System.out.println(t);
		
		System.out.println("Nos using Loop");
		for(int i=0;i<5;i++){
			System.out.println(t.get(i));
		}
		System.out.println("Using for Each Loop");
		for(int k: t){
			System.out.println(k);
		}
		
		System.out.println("Number of Element:"+t.size());
		
		//t.add(3,25);
		t.insertElementAt(25, 3);
		System.out.println("After Adding Element:");
		System.out.println(t);
		
		//t.remove(1);
		t.removeElement(15);
		System.out.println("After Remmoving Element:");
		System.out.println(t);
		
		System.out.println("Position of Any Element");
		System.out.println(t.indexOf(25));
		
		System.out.println("Search Any No");
		System.out.println(t.contains(25));
		
		t.trimToSize();
		System.out.println(t);
		
		System.out.println("Using Iterator:");
		Iterator<Integer> itr=t.iterator();
		while(itr.hasNext()){
			int n;
			n=itr.next();
			System.out.println(n);
			
		}
	System.out.println(t.lastIndexOf(5));
	}

}
