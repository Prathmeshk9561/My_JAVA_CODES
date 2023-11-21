package Inheritance;
class Base{
	public Base(){
		System.out.println("Construct Base Class");
	}
}
class Derived extends Base{
	public Derived(){
		System.out.println("Construct Derived Class");
	}
}
public class Inh8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1=new Base();
		
		Derived d1=new Derived();
	}

}
