package interrupt.call.occur.after.some.time.of.program.execution;

public class MyThread extends Thread {
	
	public void run() {
		for(int i = 0; i <=1000000; i++) {
			System.out.println("I am a lazy thread "+i);
		}
		System.out.println("I want to sleep");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println("I got Interrupted");
		}
	}

}
