package poly;

interface Int1{
	void f1();
}

interface Int2{
	void f2();
}

class Demo1 implements Int1,Int2{
	public void f1(){
		System.out.println("Call Function1");
	}
	public void f2(){
		System.out.println("Call Function2");
	}
	void f3(){
		System.out.println("Call Function3");
	}
}
public class Poly5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		d1.f1();
		d1.f2();
		d1.f3();
	}

}
