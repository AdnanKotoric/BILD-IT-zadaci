package zadaci_03_09_2016;

import java.util.Arrays;

public class Course implements Cloneable {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	// dodaje stunednte
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	// geteri i seteri
	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	// overajdamo klone metodu
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// overajdamo toString metodu
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", students="
				+ Arrays.toString(students) + ", numberOfStudents="
				+ numberOfStudents + "]";
	}

}