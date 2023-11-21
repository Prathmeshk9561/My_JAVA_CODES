package oops;
class Test9{
		static int sum(int...a){//ellipsis
			int s=0;
			for(int k:a){
				s=s+k;
			}
			return s;
			
		}
		static String sum(String s,int...a){
			int sum=0;
			for(int k:a){
				sum=sum+k;
			}
			return (s+sum);
		}
}
public class Class9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test9.sum(10, 20));
		System.out.println(Test9.sum(10, 20, 30));
		System.out.println(Test9.sum(10, 20, 30,40,50));
		System.out.println(Test9.sum(10, 20, 30,40,50,60,70,80,90));
		
		System.out.println(Test9.sum("Addiiton:",1, 2, 3));
		System.out.println(Test9.sum("Addition:",1, 2, 3,4,5));
		
	}

}
