package poly;

interface Int3{
	void f1();
}

interface Int4 extends Int3{
	void f2();
}

class Demo2 implements Int4{
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
public class Poly4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1=new Demo2();
		d1.f1();
		d1.f2();
		d1.f3();
	}

}
