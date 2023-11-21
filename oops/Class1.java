package oops;
class Test1{
	int a,b;
	void setData(int x,int y){
		a=x;
		b=y;
	}
	
	void getData(){
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
	
}
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		
		t1.setData(10,20);
		t2.setData(10, 200);
		
		t1.getData();
		t2.getData();
			
		t1.a=500;
		t1.b=1000;
		t1.getData();
	}

}
