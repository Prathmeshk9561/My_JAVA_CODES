package multi;

class ThreadAA extends Thread{
	
		public void run(){
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
class ThreadBB extends Thread{
	
	public void run(){
		for(int i=11;i<=20;i++){
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadCC extends Thread{
	
	public void run(){
		for(int i=21;i<=30;i++){
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Multi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ThreadAA t1=new ThreadAA();
		ThreadBB t2=new ThreadBB();
		ThreadCC t3=new ThreadCC();
		Thread t4=new Thread();
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(t1.isDaemon());
		System.out.println(t2.isDaemon());
		System.out.println(t3.isDaemon());
		System.out.println(t4.isDaemon());
		
		for(int i=31;i<=35;i++){
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
