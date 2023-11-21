package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Colle7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(15);
		ts.add(7);
		ts.add(21);
		ts.add(5);
		
		System.out.println(ts);
		System.out.println("Using toString Method");
		ts.add(25);
		System.out.println(ts);
		
		ts.add(10);
		System.out.println(ts);
		
		System.out.println("Using ForEach");
		for(int a:ts){
			System.out.println(a);
		}
		System.out.println("Using Iterator");
		Iterator<Integer> itr=ts.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		
		ts.remove(25);
		System.out.println(ts);
		
		
	}

}
