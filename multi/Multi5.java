package multi;

public class Multi5 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Multi5 m1=new Multi5();
		System.out.println(m1);
		System.out.println(m1.getName());
		System.out.println(m1.getThreadGroup().getName());
		System.out.println(m1.getPriority());
		
		m1.setName("Main Thread");
		m1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(m1.getName());
		System.out.println(m1.getPriority());
		
	}

}
