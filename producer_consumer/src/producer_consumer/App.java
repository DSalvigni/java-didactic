package producer_consumer;

public class App {
	

	public static void main(String[] args) throws InterruptedException {
		
		final Processor p = new Processor();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				try {
					p.produce();
				} catch (InterruptedException e){
					e.printStackTrace();
				}
			//System.out.println("I am a thread ->"+this.hashCode());		
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
			try {
				p.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("I am a thread ->"+this.hashCode());		
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
	

}
