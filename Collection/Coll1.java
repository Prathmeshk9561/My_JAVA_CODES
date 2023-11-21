package Collection;

import java.util.ArrayList;

public class Coll1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		System.out.println("Nos are:");
		System.out.println(a1);
		
		for(int a:a1){
			System.out.println(a);
		}
		System.out.println("After adding Element:");
		a1.add(2,25);
		System.out.println(a1);
		System.out.println("After removing:");
		a1.remove(2);
		System.out.println(a1);
		a1.add(50);
		a1.add(60);
		
		System.out.println(a1.get(2));
		a1.set(2, 25);
		System.out.println(a1);
		
		int n=a1.lastIndexOf(40);
		System.out.println(n);
		
		if(a1.contains(25)){
			System.out.println("Number Present");
		}
		else{
			System.out.println("Number not Present");
		}
		
		
}

	
}
