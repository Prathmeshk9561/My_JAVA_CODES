package oops;
class Test5{
	int a;
	int b;
	public Test5() //parameterless/Default
	{
		this(100,200);	
	}
	public Test5(int a,int b){ //parameterized
		this.a=a;
		this.b=b;
	}
	
	void get(){
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		}
}
public class Class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t1=new Test5();
		
		
		Test5 t2=new Test5(10,20);
		t1.get();
		t2.get();
		
	}

}
