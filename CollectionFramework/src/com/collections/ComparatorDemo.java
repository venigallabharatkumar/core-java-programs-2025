package com.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 {
	int id;
	String name;
	int age;

	Student2(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}



}

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student2> studentList = new ArrayList<>();

		studentList.add(new Student2(101, "Alsie", 25));
		studentList.add(new Student2(102, "John", 24));
		studentList.add(new Student2(103, "David", 26));

		System.out.println("Before Sorting");
		System.out.println();

		studentList.forEach(System.out::println);
		
		System.out.println();

		Collections.sort(studentList, new Comparator<Student2>() {

			public int compare(Student2 s1, Student2 s2) {
				return Integer.compare(s2.age, s1.age);
			}
		
		});
		
		System.out.println("After Sorting with age");
		
		System.out.println();
		
		studentList.forEach(System.out::println);

	}

}
