package org.practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Program : Callable sample implementation
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class CallableImplementation implements Callable<String> {

	public static void main(String[] args) {
		ExecutorService executer = Executors.newFixedThreadPool(10);
		List<Future<String>> list = new ArrayList<Future<String>>();
		Callable<String> callable = new CallableImplementation();
		
		for(int i=0; i<100; i++) {
			Future<String> future = executer.submit(callable);
			list.add(future);
		}
		
		for (Future<String> future : list) {
			try {
				System.out.println(new Date() + " :: " + future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		executer.shutdown();
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}

}
