package com.kevin.proxy;

public class CGLibProxyDemo {

	public static void main(String[] args) {
		FoobarDaoImpl foobar = FoobarServiceFactory.getInstance();
		doMathod(foobar);
	}

	public static void doMathod(FoobarDaoImpl foobar) {
		foobar.add();
		foobar.update();
		foobar.query();
		foobar.delete();
	}

}

interface FoobarDao {

	public void add();

	public void update();

	public void query();

	public void delete();
}

class FoobarDaoImpl implements FoobarDao {

	public void add() {
		System.out.println("add");
	}

	public void update() {
		System.out.println("update");
	}

	public void query() {
		System.out.println("query");
	}

	public void delete() {
		System.out.println("delete");
	}

}

class FoobarServiceFactory {
	private static FoobarDaoImpl foobar = new FoobarDaoImpl();

	private FoobarServiceFactory() {

	}

	public static FoobarDaoImpl getInstance() {
		return foobar;
	}
}
