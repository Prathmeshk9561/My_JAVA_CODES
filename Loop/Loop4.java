package Loop;
/*
 * 1 2 3 4
 * 1 2 3
 * 1 2 
 * 1 
 */
public class Loop4 {

	public static void main(String[] args) {
		int a,b;
		for(a=4;a>=1;a--)	{
			
			for(b=1;b<=a;b++) {
				System.out.print(b+" ");
			}
			System.out.println();
	
		}

	}

}
