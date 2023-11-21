package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Coll8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		
		h.put(1,"Amar");
		h.put(2,"Akash");
		h.put(3,"Samir");
		h.put(4,"Mahesh");
		h.put(5, "Nitin");
		
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
