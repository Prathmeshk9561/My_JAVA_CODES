package Inheritance;
class Base4{
		int a,b;
	public Base4(int a,int b){
		this.a=a;
		this.b=b;
	}
}
class Derived4 extends Base4{
	int add,mul;
	public Derived4(int x,int y){
		super(x,y);
		add=x+y;
		mul=x*y;
	}
	void show(){
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("Addition:"+add);
		System.out.println("Multiplication:"+mul);
	}
}
public class Inh7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Derived4 d4=new Derived4(10,5);
		d4.show();
	}

}
