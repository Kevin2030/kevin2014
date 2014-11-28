package com.kevin.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy {

	public static void main(String[] args) {
		BookFacadeCglibProxy cglib = new BookFacadeCglibProxy();
		BookFacadeCglibImpl bookFacade = (BookFacadeCglibImpl) cglib.getInstance(new BookFacadeCglibImpl());
		bookFacade.addBook();
	}

}

interface BookFacadeCglib {

	public void addBook();

}

class BookFacadeCglibImpl {

	public void addBook() {
		System.out.println("add book");
	}

}

class BookFacadeCglibProxy implements MethodInterceptor {

	private Object target;

	public Object getInstance(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("add book start");
		proxy.invoke(obj, args);
		System.out.println("add book end");
		return null;
	}

}