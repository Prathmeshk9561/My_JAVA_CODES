package oops;

class abc{
	int a,b;
	abc(int x,int y){
		a=x;
		b=y;
	}
	void show(){
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
	abc add(abc t){
		abc temp=new abc(0,0);
		temp.a=this.a+t.a;
		temp.b=this.b+t.b;
		return temp;
		
	}
}
public class Class13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc a1=new abc(10,20);
		abc a2=new abc(100,200);
		
		a1.show();
		a2.show();
		System.out.println("Addition Of Object");
		abc a3=new abc(0,0);
		a3=a1.add(a2);
		a3.show();
	}

}
