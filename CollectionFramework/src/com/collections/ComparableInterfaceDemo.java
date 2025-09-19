package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1> {
	private int id;
	private String name;
	private int age;

	Student1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student1 s) {

		return this.name.compareTo(s.name);
//		return s.age-this.age;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", age=" + age + "]";

	}
}

public class ComparableInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student1> studentList = new ArrayList<>();

		studentList.add(new Student1(101, "Alsie", 25));
		studentList.add(new Student1(102, "Jhon", 24));
		studentList.add(new Student1(103, "David", 26));

		System.out.println("Befor Sorting");
		
		System.out.println();

		studentList.forEach(System.out::println);
		
		System.out.println();

		Collections.sort(studentList);

	

		System.out.println("After Sorting by Age");
		
		System.out.println();

		studentList.forEach(System.out::println);

	}

}
