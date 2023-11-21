package Loop;

import java.util.ArrayList;

public class Loop17 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(6);
		a.add(9);
		a.add(3);
		a.add(4);
		a.add(1);
		
		System.out.println("Using Enhanced For loop");
		for(int k : a){
			System.out.println(k);
		}
		a.remove(1);
		System.out.println("Using Enhanced For loop");
		for(int k : a){
			System.out.println(k);
		}
		a.add(5);
		a.sort(null);
		System.out.println("Using Enhanced For loop");
		for(int k : a){
			System.out.println(k);
		}
	}	
	}
