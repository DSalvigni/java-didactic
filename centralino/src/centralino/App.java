package centralino;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
	//private static Object Centralino = new Object();
	
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		for(int i=1;i<10;i++) {
			es.submit(new Customer(i));
		}
		es.shutdown();
	}

}
