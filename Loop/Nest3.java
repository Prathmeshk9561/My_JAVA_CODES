package Loop;
/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */
public class Nest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		for(a=1;a<=4;a++){
				
			for(b=1;b<=a;b++){
		System.out.print(b+" ");
				}
		System.out.println();
		}
	}
}
