package thread.priority.real.world.program;

public class JPrintThread extends Thread {
	public void run() {
		for(int j = 0; j <= 10; j++) {
			System.out.println(Thread.currentThread().getName()+" -> "+j);
		}
	}
}
