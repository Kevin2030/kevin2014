package com.kevin.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
		Thread t3 = new Thread(new MyRunnable());
		Thread t4 = new Thread(new MyRunnable());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

class MyThread extends Thread {

	private int times;

	@Override
	public void run() {
		synchronized (MyThread.class) {
			for (int i = 0; i < 10; i++) {
				times++;
				System.out.println(Thread.currentThread().getName() + ":" + times);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

class MyRunnable implements Runnable {

	private int times;

	public void run() {
		synchronized (MyRunnable.class) {
			for (int i = 0; i < 10; i++) {
				times++;
				System.out.println(Thread.currentThread().getName() + ":" + times);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
