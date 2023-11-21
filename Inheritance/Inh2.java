package Inheritance;

class Base2{
		public Base2(){
			System.out.println("Construct Base2 Class");
		}
	void f1(){
		System.out.println("Call Base Method f1");
	}
	void f2(){
		System.out.println("Call Base Method f2");
	}
}
class Derived2 extends Base2{
	public Derived2(){
		System.out.println("Construct Derived2 Class");
	}
	void f2(){
		super.f2();
		System.out.println("Call Derived Method f2");
	}
	
	void f3(){
		System.out.println("Call Derived Method f3");
	}
	
}
public class Inh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived2 d1=new Derived2();
		d1.f1();
		d1.f2();
		d1.f3();
	}

}
