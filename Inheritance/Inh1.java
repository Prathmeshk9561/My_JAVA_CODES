package Inheritance;
class Base1{
	int a,b;
	void setno(int x,int y){
		a=x;
		b=y;
	}
	void getno(){
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
}
class Derived1 extends Base1{
	int add,mul;
	void setno(int p,int q){
		a=p+10;
		b=q+10;
	}
	void calc(){
		add=a+b;
		mul=a*b;
		System.out.println("Addition:"+add);
		System.out.println("Multiplication:"+mul);
	}
}
public class Inh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived1 d1=new Derived1();
		d1.setno(10, 20);
		d1.getno();
		d1.calc();
	}

}
