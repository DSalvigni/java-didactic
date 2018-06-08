package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import tuts.common.LoopTaskA;


public class App {

	public static void main(String[] args) {
	/*
		LoopTaskA a = new LoopTaskA();
		LoopTaskA b = new LoopTaskA();
		LoopTaskA c = new LoopTaskA();
		LoopTaskA d = new LoopTaskA();
		LoopTaskA e = new LoopTaskA();
		LoopTaskA f = new LoopTaskA();
		
		System.out.println("Start the thread");
		//ExecutorService execService = Executors.newFixedThreadPool(6);
		ExecutorService execService = Executors.newCachedThreadPool();

		execService.execute(a);
		execService.execute(b);
		execService.execute(c);
		execService.execute(d);
		execService.execute(e);
		execService.execute(f);
		execService.shutdown();
		
		*/
		
		//SIngle thread execution serialize the thread.
		LoopTaskA single = new LoopTaskA();
		LoopTaskA d = new LoopTaskA();
		LoopTaskA e = new LoopTaskA();
		
		ExecutorService execService2 = Executors.newSingleThreadExecutor();
		execService2.execute(single);
		execService2.execute(d);
		execService2.execute(e);
		execService2.shutdown();
		
		
		System.out.println("End the thread");
	}

}
