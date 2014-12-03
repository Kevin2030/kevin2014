package com.kevin.util.concurrency;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class GiftService {

	private static SendGiftThread sendInstance = new GiftService().new SendGiftThread();
	private static RecieveGiftThread recieveInstance = new GiftService().new RecieveGiftThread();

	public static SendGiftThread getSendGiftInstance() {
		return sendInstance;
	}

	public static RecieveGiftThread getRecieveGiftInstance() {
		return recieveInstance;
	}

	private static ConcurrentLinkedQueue<Integer> gifts = new ConcurrentLinkedQueue<Integer>();

	class SendGiftThread implements Runnable {

		public void run() {
			int gift = new Random().nextInt(100) + 1;
			gifts.add(gift);
			System.out.println("User Send Gift[" + Thread.currentThread().getId() + "]: " + gift);
		}

	}

	class RecieveGiftThread implements Runnable {

		public void run() {
			synchronized (gifts) {
				try {
					while (true) {
						if (!gifts.isEmpty()) {
							int gift = gifts.poll();
							System.out.println("================User Recieve Gift[" + Thread.currentThread().getId() + "]: " + gift);
							Thread.sleep(500);
						} else {
							Thread.sleep(10000);
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					SchedulerServiceFactory.getInstance().execute(new RecieveGiftThread());
				}
			}
		}
	}

}
