package Loop;

public class Loop16 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		
		System.out.println("For Loop:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		System.out.println("Using Enhanced For loop");
		for(int k : a){
			System.out.println(k);
		}
	}	
	}
