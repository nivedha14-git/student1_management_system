package student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentManager {

		List<Student> students=new ArrayList<>();
		public void addStudent()
		{
			Scanner scan = new Scanner(System.in);
			try
			{
				System.out.println("enter student name");
				String name=scan.nextLine();
				System.out.println("enter student age");
				int age=scan.nextInt();
				System.out.println("enter student score");
				double score=scan.nextDouble();
				students.add(new Student(name, age, score));
	            System.out.println("Student added successfully.");
	        } catch (InputMismatchException e) 
			{
	            System.out.println("Invalid input. Please try again.");

			}
			
		}
		public void displayAllStudents()
		{
			if(students.isEmpty()) {
				System.out.println("No student available");
				return;
			}
			System.out.println("list of students");
			for(Student student:students)
			{
				System.out.println(student);
			}
		}
		public void searchStudentByName()
		{
			Scanner scan=new Scanner(System.in);
			Set<String>studentNames=new HashSet<>();
			for(Student student:students)
			{
				studentNames.add(student.getName());
			}
			System.out.println("enter student name to search");
			String name=scan.nextLine();
			if(studentNames.contains(name))
			{
				for(Student student:students)
				{
					if(student.getName().equals(name))
					{
					System.out.println(student);
					return;
					}
				}
			}
			else
				System.out.println("student not found");
			
		}
		
	public void displayGrades()
	{
	Map<String,String> studentGrades=new HashMap<>();
	for(Student student:students)
	{
		studentGrades.put(student.getName(), student.calculateGrade());
	}
	System.out.println("Student Grades:");
	for(Map.Entry<String, String>entry:studentGrades.entrySet())
	{
		System.out.println("Name:"+entry.getKey());
		System.out.println("Grade:"+entry.getValue());
	}
	}
	}


