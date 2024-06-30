package programm3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int choice;
			Student[] students = new Student[3];

			for (int i = 0; i < students.length; i++) {
			    System.out.println("Enter student " + (i + 1) + " details:");
			    System.out.print("Id: ");
			    int studentId = scanner.nextInt();
			    scanner.nextLine(); // Consume newline
			    System.out.print("Name: ");
			    String studentName = scanner.nextLine();
			    System.out.print("Marks (separated by space): ");
			    int[] marks = new int[3];
			    for (int j = 0; j < marks.length; j++) {
			        marks[j] = scanner.nextInt();
			    }
			    students[i] = new Student(studentId, studentName, marks);
			}

			do {
			    System.out.println("\n1. Display all student details");
			    System.out.println("2. Display student details by name");
			    System.out.println("3. Display student details by Id");
			    System.out.println("4. Exit");
			    System.out.print("Enter your choice: ");
			    choice = scanner.nextInt();

			    switch (choice) {
			        case 1:
			            for (Student student : students) {
			                student.displayStudentDetails();
			            }
			            break;
			        case 2:
			            System.out.print("Enter student name: ");
			            scanner.nextLine(); // Consume newline
			            String studentName = scanner.nextLine();
			            for (Student student : students) {
			                student.displayStudentDetails(studentName);
			            }
			            break;
			        case 3:
			            System.out.print("Enter student Id: ");
			            int studentId = scanner.nextInt();
			            for (Student stu : students) {
			                stu.displayStudentDetails(studentId);
			            }
			            break;
			        case 4:
			            System.out.println("Exiting...");
			            break;
			        default:
			            System.out.println("Invalid choice. Please try again.");
			    }
			} while (choice!= 4);
		}
    }
}