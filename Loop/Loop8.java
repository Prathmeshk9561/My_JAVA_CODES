package Loop;
/*  
 *1
 *2 3
 *4 5 6
 *7 8 9 10
 *
 */
public class Loop8 {

	public static void main(String[] args) {
		int a,b,c;
		c=1;
		for(a=1;a<=4;a++)	{
			
			for(b=1;b<=a;b++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
	
		}

	}

}
