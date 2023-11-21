package poly;

interface Int6{
	int a=10;
	void f1();
}


class Demo5 implements Int6{
	public void f1(){
		System.out.println("Call Function1");
	}
	void f3(){
		System.out.println("Call Function3");
	}
}
public class Poly7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 d1=new Demo5();
		d1.f1();
		d1.f3();
		System.out.println(Int6.a);
	}

}
