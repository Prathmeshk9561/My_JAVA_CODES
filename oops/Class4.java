package oops;
class Test4{
	int a;
	int b;
	public Test4() //parameterless/Default
	{
		a=10;
		b=20;
	}
	public Test4(int a,int b){ //parameterized
		this.a=a;
		this.b=b;
	}
	public Test4(Test4 temp){ //copy constructor
		this.a=temp.a;
		this.b=temp.b;
		
	}
	void show(){
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		}
}
public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t1=new Test4();
		t1.show();
		
		Test4 t2=new Test4(100,200);
		t2.show();
		
		Test4 t3=new Test4(t2);
		t3.show();
	}

}
