package poly;

interface Base1{
	void f1();//abstarct public static
	void f2();
}
class Derived1 implements Base1{
	public void f1(){
		System.out.println("Derived Class F1 Method");
	}
	public void f2(){
		System.out.println("Derived Class F1 Method");
	}

	void f3(){
		System.out.println("Derived Class F3 Method");
	}
		
}
public class Poly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1;
				
		Derived d1=new Derived();
		d1.f1();
		d1.f2();
		d1.f3();
	}

}
