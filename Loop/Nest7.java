package Loop;
/*
 * 1 2 3 4
 * 5 6 7
 * 8 9
 * 10 
 */
public class Nest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		c=1;
		for(a=4;a>=1;a--){
				
			for(b=1;b<=a;b++){
		System.out.print(c+" ");
		c++;
		}
		System.out.println();
		}
	}
}
