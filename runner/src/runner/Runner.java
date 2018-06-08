package runner;

public class Runner {
	private int ciao=0;

	public void doWork() {
			Thread t1 = new Thread(new Runnable(){	
			public void run(){
				for(int i=0;i<10;i++) {
					System.out.println("Hello, I am a thread -> "+(i+ciao));
				}
			}
			
		});
	t1.start();	
	}
	
	
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner a =  new Runner();
		a.doWork();
	}


}
