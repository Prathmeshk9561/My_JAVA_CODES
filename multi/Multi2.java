package multi;

class Run1 implements Runnable{
	
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
class Run2 implements Runnable{
	
	public void run(){
		for(int i=11;i<=20;i++){
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

class Run3 implements Runnable{
	
	public void run(){
		for(int i=21;i<=30;i++){
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

public class Multi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run1 r1=new Run1();
		Run2 r2=new Run2();
		Run3 r3=new Run3();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
