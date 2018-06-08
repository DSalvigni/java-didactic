package producer_consumer;

import java.util.Scanner;

public class Processor {
	
	public void produce() throws InterruptedException {
		
		synchronized(this) {
				System.out.println("I am running, send in wait -> "+Thread.currentThread().hashCode());
				wait();
				System.out.println("Resumed -> "+Thread.currentThread().hashCode());			
		}
		
		

	}
	
	public void consume() throws InterruptedException {	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("6 seconds sleep -> "+Thread.currentThread().hashCode());
		Thread.sleep(6000);	
		synchronized(this) {
			System.out.println("Notify from sleep (Push return)-> "+Thread.currentThread().hashCode());
			scanner.nextLine();
			System.out.println("Notified! -> "+Thread.currentThread().hashCode());
			notify();
			Thread.sleep(4000);	
		}
		
	}

}
