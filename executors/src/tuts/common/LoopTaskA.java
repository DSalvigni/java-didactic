package tuts.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {

	private static int count = 0;
	private int id;
	
	public void run() {
		System.out.println("###### TASK -> "+id+" Starting ######");
		for(int i = 10; i>0; i--) {
			System.out.println("Task number: "+id+" - TICK TACK "+id);
			try {
				TimeUnit.MILLISECONDS.sleep((long)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("######## TASK -> "+id+" Ended ########");
	}
	
	//Implement a counter for the constructor to identify the id of the tread
	public LoopTaskA() {
		this.id = count++;
		//this.start();
	}

}
