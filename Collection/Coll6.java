package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Coll6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t1=new TreeSet<Integer>();
		
	t1.add(10);
	t1.add(5);
	t1.add(20);
	t1.add(15);
	t1.add(7);
	System.out.println("Values in Tree Set:"+t1);
	System.out.println("Values are");
	for(Integer i:t1){
		System.out.println(i);
	}
	
	Iterator<Integer> itr=t1.iterator();
	System.out.println("Using Iterator:");
	while(itr.hasNext()){
		int a=itr.next();
		System.out.println(a);
	}
	
	System.out.println("After adding Element");
	t1.add(9);
	System.out.println(t1);
	
	System.out.println("After Deleteing Element");
	t1.remove(9);
	System.out.println(t1);
	
	System.out.println(t1.contains(10));
	
	t1.add(7);
	System.out.println(t1);
	
	}

}
