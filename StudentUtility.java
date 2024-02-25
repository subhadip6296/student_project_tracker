package com.studentmanagement;
import java.util.*;

public class StudentUtility {
	static Scanner sc = new Scanner(System.in);
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//	}
	
	//1. ADD STUDENT
	public static Student addStudent() {
		Student s = new Student();
		System.out.print("Please enter StudentId: ");
		s.setsId(sc.nextInt());
//		s.setsId(sc.nextInt());
		System.out.print("Please enter Student Name: ");
		s.setSname(sc.next());
		System.out.print("Please enter StudentAge: ");
		s.setAge(sc.nextInt());
		return s;
	}
	
	
	//2. UPDATE STUDENT
	public static void updateStudent(List<Student> students) {
		System.out.println("Please Enter the Details to be Updated: ");
		System.out.println("Enter Student ID: ");
		int id = sc.nextInt();
		System.out.println("Enter Student Name: ");
		String name = sc.next();
		System.out.println("Enter Student Age: ");
		int age = sc.nextInt();
		
		//CHANGES IN STUDENT LIST
		for(Student st : students) {
            if(id == st.getsId()) {
                st.setSname(name);
                st.setAge(age);
                System.out.println("Student Updated Successfully");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
	}
	
	
	//3. DISPLAY STUDENT
	public static void displayAllStudent(List<Student> students) {
		Iterator<Student> studentIterator = students.iterator();
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next().toString());
		}
	}
	
	
	//4. DELETE STUDENT
	public static void deleteStudent(List<Student> students, int sid) {
		Iterator<Student> studentIterator = students.iterator();
		while(studentIterator.hasNext()) {
			Student s = studentIterator.next();
			if(s.getsId()==sid) {
				studentIterator.remove();
			}
		}
	}

}
