package Loop;
/*  
 *1 2 3 4 
 *5 6 7
 *8 9 
 *10
 *
 */
public class Loop7 {

	public static void main(String[] args) {
		int a,b,c,d;
		d=1;
		for(a=1;a<=4;a++)	{
			for(c=a;c<4;c++){
				System.out.print(" ");
			}
			for(b=1;b<=a;b++) {
				System.out.print(d+" ");
				d++;
				
			}
			System.out.println();
	
		}

	}

}
