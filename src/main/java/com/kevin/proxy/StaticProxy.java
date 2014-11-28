package com.kevin.proxy;

public class StaticProxy {

	public static void main(String[] args) {
		CountImpl count = new CountImpl();
		CountProxy proxy = new CountProxy(count);
		proxy.queryCount();
		proxy.updateCount();
	}

}

interface Count {

	public void queryCount();

	public void updateCount();
}

class CountImpl implements Count {

	public void queryCount() {
		System.out.println("query count");
	}

	public void updateCount() {
		System.out.println("update count");
	}

}

class CountProxy implements Count {

	private CountImpl count;

	public CountProxy(CountImpl count) {
		this.count = count;
	}

	public void queryCount() {
		System.out.println("query count start");
		count.queryCount();
		System.out.println("query count end");
	}

	public void updateCount() {
		System.out.println("update count start");
		count.updateCount();
		System.out.println("update count end");
	}

}