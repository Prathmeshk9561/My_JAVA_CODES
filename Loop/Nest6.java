package Loop;
/*
 * 10 9 8 7
 * 6 5 4
 * 3 2
 * 1
 *  
 */
public class Nest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		c=10;
		for(a=4;a>=1;a--){
				
			for(b=1;b<=a;b++){
		System.out.print(c+" ");
		c--;
		}
		System.out.println();
		}
	}
}
