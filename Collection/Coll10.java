package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Coll10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> h=new TreeMap<String,Integer>();
		
		h.put("Amar",5);
		h.put("Akash",3);
		h.put("Samir",1);
		h.put("Mahesh",2);
		h.put("Nitin",4);
		
		System.out.println("Key Pairs");
		System.out.println(h);
		
		h.put("Samir",7);
		System.out.println("Key Pairs");
		System.out.println(h);
		
		h.put( "Nitin",9);
		System.out.println("Key Pairs");
		System.out.println(h);
		
		System.out.println("Contains Key:"+h.containsKey("Akash"));
		
		System.out.println("Contains Key:"+h.containsKey("Nitin"));
		
		System.out.println("Sandip is there:"+h.containsValue("Sandip"));
		
		System.out.println(h.keySet());
		
		System.out.println("Using Set:");
		Set<String> s=h.keySet();
		for(String i:s){
			System.out.println(i);
		}
		System.out.println(h.values());
		
		System.out.println("Using Collection:");
		System.out.println("Values are:");
		Collection<Integer> s1=h.values();
		for(Integer str:s1){
			System.out.println(str);
		}
	}

}
