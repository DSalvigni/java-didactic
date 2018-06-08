package deadlock;

public class App {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread01 T1 = new Thread01(Lock1,Lock2);
		Thread02 T2 = new Thread02(Lock1,Lock2);
		T1.start();
	    T2.start();
		
	}

}
