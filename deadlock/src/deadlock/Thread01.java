package deadlock;

public class Thread01 extends Thread{
	
	//variable
	private Object obj1;
	private Object obj2;
	 
	//Assignment with constructor
	 public Thread01(Object obj1, Object obj2) {
		 this.obj1 = obj1;
		 this.obj2 = obj2;
	 }
	
	 //Run the thread which synchonized the use of access to Obj
	public void run() {
		System.out.println("I am a thread with name "+this.hashCode());
		synchronized (obj1) {
			System.out.println("Thread "+this.hashCode()+": Holding lock 1...");
			 
			 try { Thread.sleep(2000); }
	         catch (InterruptedException e) {}
	         System.out.println("Thread "+this.hashCode()+": Waiting for lock 2...");
	         
         synchronized (obj2) {
             System.out.println("Thread "+this.hashCode()+": Holding lock 1 & 2...");
          }
		
		}
	}
	
	
}
