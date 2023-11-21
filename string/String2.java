package string;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String();
		String s2=new String("City");
		String s3=new String(s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		char ch[]={'A','b','c','d'};
		String s4=new String(ch);
		System.out.println(s4);
		
		String s5=new String(ch,1,3);
		System.out.println(s5);
	}

}
