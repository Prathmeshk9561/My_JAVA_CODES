package multi;

class Thread1A extends Thread{
	
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
class Thread2A extends Thread{
	
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

class Thread3A extends Thread{
	
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

public class Multi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Thread1A t1=new Thread1A();
		Thread2A t2=new Thread2A();
		Thread3A t3=new Thread3A();
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=1;i<=10;i++){
			if(i==2)
				t2.suspend();
			if(i==5)
					t2.resume();
			if(i==6)
					t3.stop();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
