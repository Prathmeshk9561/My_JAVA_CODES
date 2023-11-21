package Loop;
/*
 *4 3 2 1
 *3 2 1
 *2 1
 *1
 */
public class Loop5 {

	public static void main(String[] args) {
		int a,b;
		for(a=4;a>=1;a--)	{
			
			for(b=a;b>=1;b--) {
				System.out.print(b+" ");
			}
			System.out.println();
	
		}

	}

}
