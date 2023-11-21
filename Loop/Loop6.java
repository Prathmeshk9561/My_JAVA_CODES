package Loop;
/*
 *1 2 3 4
 *2 3 4
 *3 4 
 *4
 */
public class Loop6 {

	public static void main(String[] args) {
		int a,b;
		for(a=1;a<=4;a++)	{
			
			for(b=a;b<=4;b++) {
				System.out.print(b+" ");
			}
			System.out.println();
	
		}

	}

}
