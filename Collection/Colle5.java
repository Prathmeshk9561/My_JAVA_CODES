package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Colle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(10);
		hs.add(15);
		hs.add(7);
		hs.add(21);
		hs.add(5);
		
		System.out.println(hs);
		System.out.println("Using toString Method");
		hs.add(25);
		System.out.println(hs);
		
		hs.add(10);
		System.out.println(hs);
		
		System.out.println("Using ForEach");
		for(int a:hs){
			System.out.println(a);
		}
		System.out.println("Using Iterator");
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		
		hs.remove(25);
		System.out.println(hs);
		
		
	}

}
