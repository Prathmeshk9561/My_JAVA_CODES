package Inheritance;
class Base3{
	int a,b;
	Base3(int x,int y){
		a=x;
		b=y;
	}
	void getno(){
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
}
class Derived3 extends Base3{
	int add,mul,m,n;
	Derived3(int p,int q,int l,int o){
		super(p,q);
		m=l;
		n=o;
		
	}
	void calc(){
		add=a+b;
		mul=a*b;
		System.out.println("Addition:"+add);
		System.out.println("Multiplication:"+mul);
	}
}
public class Inh3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived3 d3=new Derived3(10,20,40,50);
		
		d3.getno();
		d3.calc();
	}

}
