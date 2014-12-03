package com.kevin.util.concurrency;

public class SendGiftThread implements Runnable {

	private static int times = 1;

	public void run() {
		synchronized (SendGiftThread.class) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		System.out.println("Send[" + Thread.currentThread().getId() + "] : " + times);
		times++;
	}

}
