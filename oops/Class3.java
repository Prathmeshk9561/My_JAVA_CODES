package oops;
class Test3{
	int a;
	int b;
	final int c=10;
	final int d;
	final int e;
	{
		d=100;
	}
	public Test3()
	{
		e=200;
	}
	void show(){
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("C:"+c);
		System.out.println("D:"+d);
		System.out.println("E:"+e);
	}
}
public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t1=new Test3();
		t1.a=5;
		t1.b=10;

		t1.show();
	}

}
