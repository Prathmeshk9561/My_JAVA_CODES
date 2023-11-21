package multi;
class R1{
	void share(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread21 extends Thread{
		R1 obj;
		
		Thread21(R1 ob){
			this.obj=ob;
		}
		public void run(){
			synchronized(obj){
				obj.share();
			}
			
		}
}

class Thread22 extends Thread{
	R1 obj;
	Thread22(R1 ob){
		
		this.obj=ob;
	}
	public void run(){
		synchronized(obj){
	obj.share();
		}
		
	}
}

public class Multi8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		R1 r1=new R1();
		Thread21 t1=new Thread21(r1);
		Thread22 t2=new Thread22(r1);
				
		t1.start();
		t2.start();
				
	}

}
