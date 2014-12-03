package com.kevin.util.concurrency;

public class RecieveGiftThread implements Runnable {

	private static int times = 1;

	public void run() {
		System.out.println("Recieve[" + Thread.currentThread().getId() + "] : " + times);
		times++;
	}

}
