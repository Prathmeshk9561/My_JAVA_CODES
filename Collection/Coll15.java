package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Coll15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Stack<Integer> t=new Stack<Integer>();
		t.push(5);
		t.push(10);
		t.push(15);
		t.push(20);
		t.push(30);
		t.push(40);
		
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
		System.out.println("Elements After adding Last:"+t);
		while(t.peek()!=null){
			System.out.println("Pop:"+t.pop());
		}
		
		System.out.println(t.isEmpty());
		
	
	}

}
