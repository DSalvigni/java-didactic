package thread;

import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		
		Thread thread01 =  new MyTask();
		Thread thread02 =  new MyTask();
		thread01.start();
		thread02.start();
		
		
	}

}

class MyTask extends Thread {
	private static int count = 0;
	private int id;
	private int code;
	
	public void run() {
		for(int i = 10; i>0; i--) {
			System.out.println("Tick Tack ->  Task number: "+ i+" ID -> "+id+" HASH -> "+code);
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	//Implement a counter for the constructor to iudentify thhe id of the tread
	public MyTask() {
		this.id = count++;
		this.code = this.hashCode();
		//this.start();
	}

}

