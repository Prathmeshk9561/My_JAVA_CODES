package oops;
class Test2{
	int a,b;
	
	static{
		System.out.println("Welcome to Instance Block");
	}
	void setData(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	void getData(){
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
	
	public String toString(){
		return ("Test2 [A: "+a+" B:"+b+ "]");
	}
}
public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t1=new Test2();
		Test2 t2=new Test2();
		
		t1.setData(10,20);
		t2.setData(10, 200);
		
		t1.getData();
		t2.getData();
		
		System.out.println(t1.toString());
			
	}

}
