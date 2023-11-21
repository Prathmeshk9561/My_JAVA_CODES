package oops;
class Time{
	int hr,min;
	public Time()
	{
		hr=0;
		min=0;
	}
	public Time(int m){
		this.hr=m/60;
		this.min=m%60;
	}
	
	public Time(Time temp){
		this.hr=temp.hr;
		this.min=temp.min;
	}
	void show(){
		System.out.println("Hour:"+hr);
		System.out.println("Minute:"+min);
		}
}
public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1=new Time();
		t1.show();
		
		Time t2=new Time(100);
		t2.show();
		
		Time t3=new Time(300);
		t3.show();
		
		Time t4=new Time(t3);
		t4.show();
	
	}

}
