package Inheritance;
class B1{
	void f1(){
		System.out.println("Call Base Function1");
	}
	void f2(){
		System.out.println("Call Base Function2");
	}

}
class D1 extends B1{
	void f2(){
		System.out.println("Call Derived Function2");
	}
}
public class Poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b=new B1();
		b.f1();//CTL
		b.f2();//CTL
		
		
		D1 d=new D1();
		d.f1();//CTL
		d.f2();//CTL
		
		B1 b2=new D1();//upcasting
		d.f1();//RTL
		d.f2();//CTL
		
		d=(D1)b;
		d.f1();//RTL
		d.f2();//CTL
		
	}

}
