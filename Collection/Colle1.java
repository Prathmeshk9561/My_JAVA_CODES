package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Colle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> t=new ArrayList<Integer>();
		
		t.add(10);
		t.add(15);
		t.add(20);
		t.add(30);
		t.add(40);
		
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
		
		t.add(3,25);
		System.out.println("After Adding Element:");
		System.out.println(t);
		
		t.remove(1);
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
	}

}
