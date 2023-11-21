package string;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="City";
		String y="City";
		System.out.println(s);
		System.out.println(y);
		
		if(s==y)
				System.out.println("Both have Same reference");
	else
		System.out.println("Both have Different reference");
		
		if(s.equals(y))
			System.out.println("Both are Same String");
		else
			System.out.println("Both are not Same String");
	
	String x=new String("City");
	if(s==x)
		System.out.println("Both have Same reference");
else
System.out.println("Both have Different reference");

if(s.equals(x))
	System.out.println("Both are Same String");
else
	System.out.println("Both are not Same String");
	}

}
