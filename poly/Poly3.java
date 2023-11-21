package poly;

interface I3{
	void f1();//abstarct public static
	
}
interface I4 extends I3{
	void f2();
}
class Imp2 implements I4{
	public void f1(){
		System.out.println("Implement F1 Method");
	}
	public void f2(){
		System.out.println("Implement F2 Method");
	}

	void f3(){
		System.out.println("Derived Class F3 Method");
	}
		
}
public class Poly3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imp2 I1=new Imp2();
		I1.f1();
		I1.f2();
		I1.f3();
	}

}
