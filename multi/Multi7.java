package multi;
class R{
	synchronized void share(){
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

class Thread11 extends Thread{
		R obj;
		Thread11(R ob){
			this.obj=ob;
		}
		public void run(){
			
		obj.share();
	}
}

class Thread12 extends Thread{
	R obj;
	Thread12(R ob){
		this.obj=ob;
	}
	public void run(){
		
	obj.share();
}
}


public class Multi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		R r1=new R();
		Thread11 t1=new Thread11(r1);
		Thread12 t2=new Thread12(r1);
				
		t1.start();
		t2.start();
				
	}

}
