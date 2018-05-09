package com.yali.day25;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCenterManagement {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		try (InputHandler in = new InputHandler(System.in)) {
			if (in.readLoginOption() == LoginMenu.STUDENT) {
				while (in.hasNext()) {
					service.addStudent(in.readStudent());
				}
			}
			service.reportOfTotalStudents();
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}

	}
}

enum Grade {
	AVG, ABOVE_AVG, GOOD, GREAT
}

enum LoginMenu {
	STUDENT(1), TRAINER(2), COUNSELOR(3), NO_OPT(0);

	private int number;

	LoginMenu(int number) {
		this.number = number;
	}

	public int getOption() {
		return number;
	}

	public String toString() {
		return this + " " + number;
	}

	public LoginMenu[] getAllOptions() {
		return this.getDeclaringClass().getEnumConstants();
	}

}

class StudentService {
	private List<Student> students = new ArrayList<>();

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		if (student == null) {
			throw new IllegalArgumentException("Not a valid stuent");
		}
		students.add(student);
	}

	public void reportOfTotalStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

}

class InputHandler implements Closeable {
	Scanner sc = null;

	public InputHandler(InputStream in) {
		sc = new Scanner(in);
	}

	public boolean hasNext() {
		System.out.println("Do you want to enter details? Enter Y to continues");
		String hasNext = sc.next();
		if (hasNext.equals("Y") || hasNext.equals("y")) {
			return true;
		}
		return false;
	}

	public LoginMenu readLoginOption() {
		System.out.println("Enter number for below options");
		for (LoginMenu loginMenu : LoginMenu.values()) {
			System.out.println(loginMenu.name() + "(" + loginMenu.getOption() + ")");
		}
		int optionNumber = sc.nextInt();
		switch (optionNumber) {
		case 1:
			return LoginMenu.STUDENT;
		case 2:
			return LoginMenu.TRAINER;
		case 3:
			return LoginMenu.COUNSELOR;
		default:
			return LoginMenu.NO_OPT;
		}
	}

	public Student readStudent() {
		System.out.println("Enter student name");
		return new Student(101, sc.next(), Grade.GREAT);
	}

	@Override
	public void close() throws IOException {
		sc.close();
	}

}

class Student {
	private int id;
	private String name;
	private Grade grade;

	public Student(int id, String name, Grade grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

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

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

}
