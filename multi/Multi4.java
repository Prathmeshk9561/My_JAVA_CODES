package multi;

class Thread1B extends Thread{
	
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
class Thread2B extends Thread{
	Thread1B t1;
	public Thread2B (Thread1B t1){
		this.t1=t1;
	}
	public void run(){
		try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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

class Thread3B extends Thread{
	Thread2B t2;
	Thread3B(Thread2B t2){
		this.t2=t2;
	}
	public void run(){
		try {
			t2.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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

public class Multi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Thread1B t1=new Thread1B();
		Thread2B t2=new Thread2B(t1);
		Thread3B t3=new Thread3B(t2);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t3.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=31;i<=40;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t2.isAlive());
		}
	}

}
