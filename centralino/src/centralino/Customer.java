package centralino;

import java.util.Random;

public class Customer implements Runnable{
	private int id;
	private Random random = new Random();
	private int min= 3000;
	private int max = 8000;

	public Customer(int id) {
		this.id=id;
	}
	
	
	public synchronized void answer(){
		int time = random.nextInt(max + 1 - min) + min;
		System.out.println(this.hashCode()+" -> Answered ->"+this.id); 
		try {		
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.hashCode()+" -> Completed in "+time+" sec->"+this.id); 
		
		
		
	}
	
	
	public void run() {				
		answer();
	}

}

