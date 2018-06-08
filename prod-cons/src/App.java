import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(100);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread a = new Thread(new Runnable() {
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread b = new Thread(new Runnable() {
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		a.start();
		b.start();
		
		a.join();
		b.join();
		
	}
	
	private static void producer() throws InterruptedException {
		Random rand = new Random();
		while(true) {
			queue.put(rand.nextInt(100));
		}
		
	}
	
	private static void consumer() throws InterruptedException {
		Random rand = new Random();
		while(true) {
			Thread.sleep(100);
			if(rand.nextInt(100)==0) {
				Integer value = queue.take();
				System.out.println("Taken value: "+value+" - Queue size -> "+queue.size());
			}
			
		}
	}
	
	



}
