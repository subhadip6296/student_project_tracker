package com.studentmanagement;

import java.util.*;

public class StudentTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        int count = 0;
        while (true) {
            if (count != 0) {
                System.out.println("\n\nDo You Want To Continue? Press 'Yes', or if you want to Exit, Press 'No'");
                String continues = sc.next();
                if (!continues.equalsIgnoreCase("Yes")) {
                    System.out.println("Exiting the program...");
                    System.exit(0);
                }
            }
            count++;
            System.out.println("\t\t\t\t\tStudent Project Tracker");
            System.out.println("======================================================================");
            System.out.println(
                    "1. Add Student\n" +
                    "2. Update Student\n" +
                    "3. Display All Students\n" +
                    "4. Delete Student\n" +
                    "5. Exit\n"
            );
            System.out.println("Please Select an option:");
            int option;
            try {
                option = sc.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a valid option.");
                sc.nextLine(); // Clear the invalid input
                continue;
            }

            // SWITCH FOR PARTICULAR OPERATION
            switch (option) {
                case 1:
                    // ADD STUDENT
                    Student student = StudentUtility.addStudent();
                    studentList.add(student);
                    System.out.println("Student Added Successfully.");
                    break;
                case 2:
                    // UPDATE STUDENT
                    StudentUtility.updateStudent(studentList);
                    System.out.println("Student Updated Successfully");
                    break;
                case 3:
                    // DISPLAY STUDENTS
                    StudentUtility.displayAllStudent(studentList);
                    break;
                case 4:
                    // DELETE STUDENT
                    System.out.println("Delete Student option is proceeding?");
                    System.out.println("Enter Student ID:");
                    int sid;
                    try {
                        sid = sc.nextInt();
                    } catch (InputMismatchException ex) {
                        System.err.println("Invalid input for Student ID. Please enter a valid integer.");
                        sc.nextLine(); // Clear the invalid input
                        break;
                    }
                    StudentUtility.deleteStudent(studentList, sid);
                    System.out.println("Student Deleted Successfully");
                    break;
                case 5:
                    // STOP THE PROGRAM EXECUTION
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Please Enter Correct Option");
                    break;
            }
        }
    }
}
