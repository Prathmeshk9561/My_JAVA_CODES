package oops;

class Time1{
	int hr,min;
	Time1(int m){
		hr=m/60;
		min=m%60;
	}
	void show(){
		System.out.println("Hour:"+hr);
		System.out.println("Minutes:"+min);
	}
	Time1 add(Time1 t){
		Time1 temp=new Time1(0);
		temp.min=this.min+t.min;
		temp.hr=this.hr+t.hr+temp.min/60;
		temp.min=temp.min%60;
		return temp;
		
	}
}
public class Class14 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time1 t1=new Time1(100);
		Time1 t2=new Time1(200);
		
		t1.show();
		t2.show();
		System.out.println("Addition Of Time");
		Time1 t3=new Time1(0);
		t3=t1.add(t2);
		t3.show();
	}

}
