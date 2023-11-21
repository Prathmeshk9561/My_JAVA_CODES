package poly;

abstract class Base{
	abstract void f1();
	void f2(){
		System.out.println("Base Class F2 Method");
	}
}
class Derived extends Base{
	void f1(){
		System.out.println("Derived Class F1 Method");
	}
	void f3(){
		System.out.println("Derived Class F3 Method");
	}
		
}
public class Poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1;
				
		Derived d1=new Derived();
		d1.f1();
		d1.f2();
		d1.f3();
	}

}
