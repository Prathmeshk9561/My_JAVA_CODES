package poly;

interface Int5{
	void f1();
}

 class  Demo3{
	void f2(){
		System.out.println("Call Function2");	
	}
}

class Demo4 extends Demo3 implements Int5{
	public void f1(){
		System.out.println("Call Function1");
	}
	public void f2(){
	
	}
	void f3(){
		System.out.println("Call Function3");
	}
}
public class Poly6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		d1.f1();
		d1.f2();
		d1.f3();
	}

}
