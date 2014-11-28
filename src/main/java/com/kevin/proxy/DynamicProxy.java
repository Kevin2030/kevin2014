package com.kevin.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {

	public static void main(String[] args) {
		BookFacadeProxy proxy = new BookFacadeProxy();
		BookFacade bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl());
		bookProxy.addBook();
		bookProxy.deleteBook(12);

		bookProxy = (BookFacade) proxy.bind(new CookBookFacadeImpl());
		bookProxy.addBook();
		bookProxy.deleteBook(1);
	}

}

interface BookFacade {

	public void addBook();

	public void deleteBook(int id);

}

class BookFacadeImpl implements BookFacade {

	public void addBook() {
		System.out.println("add book");
	}

	public void deleteBook(int id) {
		System.out.println("delete book id=" + id);
	}

}

class CookBookFacadeImpl implements BookFacade {

	public void addBook() {
		System.out.println("add cook book");
	}

	public void deleteBook(int id) {
		System.out.println("delete cook book id=" + id);
	}

}

class BookFacadeProxy implements InvocationHandler {

	private Object target;

	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("add book start");
		result = method.invoke(target, args);
		System.out.println("add book end");
		return result;
	}

}