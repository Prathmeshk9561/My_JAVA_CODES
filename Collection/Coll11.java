package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Coll11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> h=new TreeMap<Integer,String>();
		
		h.put(5,"Amar");
		h.put(3,"Akash");
		h.put(1,"Samir");
		h.put(4,"Mahesh");
		h.put(2, "Nitin");
		
		System.out.println("Key Pairs");
		System.out.println(h);
		
		h.put(6, "ANiket");
		System.out.println("Key Pairs");
		System.out.println(h);
		
		h.put(2, "Sandip");
		System.out.println("Key Pairs");
		System.out.println(h);
		
		System.out.println("Contains Key:"+h.containsKey(1));
		
		System.out.println("Contains Key:"+h.containsKey(100));
		
		System.out.println("Sandip is there:"+h.containsValue("Sandip"));
		
		System.out.println(h.keySet());
		
		System.out.println("Using Set:");
		Set<Integer> s=h.keySet();
		for(int i:s){
			System.out.println(i);
		}
		System.out.println(h.values());
		
		System.out.println("Using Collection:");
		System.out.println("Values are:");
		Collection<String> s1=h.values();
		for(String str:s1){
			System.out.println(str);
		}
		h.replace(2,"Aniket");
		
		System.out.println(h);
	}

}
