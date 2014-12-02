package com.kevin.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy {

	public static void main(String[] args) {
		BookFacadeCglibProxy cglib = new BookFacadeCglibProxy();
		BookFacadeCglib bookFacade = new BookFacadeCglibImpl();
		BookFacadeCglib bfc = (BookFacadeCglib) cglib.createProxy(bookFacade);
		bfc.addBook();
	}

}

interface BookFacadeCglib {

	public void addBook();

}

class BookFacadeCglibImpl implements BookFacadeCglib {

	public void addBook() {
		System.out.println("add book");
	}

}

class BookFacadeCglibProxy implements MethodInterceptor {

	// 要代理的对象
	private Object target;

	public Object createProxy(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		enhancer.setCallback(this);
		// enhancer.setClassLoader(this.getClass().getClassLoader());
		return enhancer.create();
	}

	public Object intercept(Object proxy, Method method, Object[] params, MethodProxy methodProxy) throws Throwable {
		Object result = null;
		doBefore();
		result = methodProxy.invokeSuper(proxy, params);
		doAfter();
		return result;
	}

	private void doBefore() {
		System.out.println("add book start");
	}

	private void doAfter() {
		System.out.println("add book after");
	}

}