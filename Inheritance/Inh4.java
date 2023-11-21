package Inheritance;
class Abc{
	int a,b;
	Abc(int x,int y){
		a=x;
		b=y;
	}
}
class Xyz extends Abc{
	int add,mul;
	Xyz(int x,int y){
		super(x,y);
		add=a+b;
		mul=a*b;
	}
	void show(){
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("Additon:"+add);
		System.out.println("Multiplication:"+mul);
	}
}
public class Inh4 {
public static void main(String [] Args){
	Xyz x1=new Xyz(10,20);
	x1.show();
}
}
