package string;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("city");
		System.out.println(s1);
		s1=s1.toUpperCase();
		System.out.println(s1);
		
		s1=s1.toLowerCase();
		System.out.println(s1);
		
		System.out.println(s1.length());
		
		s1=s1.replace('c','x');
		System.out.println(s1);
		
		s1=s1.replace("xity", "city");
		System.out.println(s1);
		
		s1=s1.concat("Karad");
		System.out.println(s1);
		
		s1="     City    Karad   ";
		s1=s1.trim();
		System.out.println(s1);
		
		System.out.println(s1.substring(3));
		
		System.out.println(s1.substring(2,10));
		
		System.out.println(s1.charAt(3));
		
		s1="city computer karad city";
		System.out.println(s1.indexOf("city",5));
	}

}
