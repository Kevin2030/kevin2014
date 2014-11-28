package com.kevin.innerclass;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class RelationShipOfClass {

	private String name;
	private int age;

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 31).append(name).append(age).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof RelationShipOfClass)) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		RelationShipOfClass rhs = (RelationShipOfClass) obj;
		return new EqualsBuilder().append(name, rhs.name).append(age, rhs.age).isEquals();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Integer a = new Integer(12);
		Integer b = new Integer(12);
		System.out.println(a.equals(b));
		System.out.println(a == b);

		RelationShipOfClass r1 = new RelationShipOfClass();
		r1.setAge(12);
		r1.setName("Kevin");
		RelationShipOfClass r2 = new RelationShipOfClass();
		r2.setAge(12);
		r2.setName("Kevin");
		System.out.println(r1.equals(r2));
		System.out.println(r1 == r2);

	}
}

/**
 * 类之间的三种关系
 */
class A {

}

class B extends A {// 继承关系(is-a)

}

class C {// 聚集关系(has-a)
	public A a;
	public B b;
}

class D {// 依赖关系(uses-a)

	static class E {

	}

	class F {

	}

}