package com.collections;

import java.util.ArrayList;

class Student {
	private int id;
	private String name;
	private double grade;

	Student(int id, String name, double grade) {
		this.id = id;
		this.name=name;
		this.grade=grade;

	}

	public void getStudentInfo() {
		System.out.println("id = " + id + " name = " + name + " grade = " + grade);
	

	}

}

public class TrySafeArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student (101, "Srini", 98.567));
		studentList.add(new Student (102, "Ashok", 98.34567));
		
		for(Student s : studentList) {
//			System.out.println(studentList);
			
			s.getStudentInfo();
		}
		
				

	}

}
