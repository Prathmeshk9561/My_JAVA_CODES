package oops;
class Test8{
	static int sum(int a,int b){
			return (a+b);
	}
	static int sum(int a,int b,int c){
		return (a+b+c);
}
	static float sum(float a,float b){
		return (a+b);
}
	static String sum(String a,String b){
		return (a+b);
}
}
public class Class8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test8.sum(10, 20));
		System.out.println(Test8.sum(10, 20, 30));
		System.out.println(Test8.sum(12.33f, 12.33f));
		System.out.println(Test8.sum("Ajay","Amir"));
		System.out.println(Test8.sum('A','A'));
	}

}
