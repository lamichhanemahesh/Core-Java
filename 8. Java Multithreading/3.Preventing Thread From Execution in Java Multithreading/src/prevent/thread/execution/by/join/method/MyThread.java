package prevent.thread.execution.by.join.method;

public class MyThread extends Thread {
	
	public void run() {
		for( int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" -> "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
