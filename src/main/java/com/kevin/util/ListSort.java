package com.kevin.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListSort {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student s = new Student();
			s.setId(i);
			s.setName("name" + i);
			s.setAge(10 + new Random().nextInt(18));
			students.add(s);
		}
		Collections.sort(students);
		System.out.println(students);
		List<Teacher> teachers = new ArrayList<Teacher>();
		for (int i = 0; i < 10; i++) {
			Teacher t = new Teacher();
			t.setId(i);
			t.setName("name" + i);
			t.setAge(26 + new Random().nextInt(40));
			teachers.add(t);
		}
		Collections.sort(teachers, new MyComarator());
		System.out.println(teachers);
	}
}

class MyComarator implements Comparator<Teacher> {

	public int compare(Teacher o1, Teacher o2) {
		return o1.getAge() > o2.getAge() ? 1 : o1.getAge() == o2.getAge() ? 0 : -1;
	}

}

class Teacher {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int compareTo(Student o) {
		return this.age > o.age ? 1 : this.age == o.age ? 0 : -1;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
