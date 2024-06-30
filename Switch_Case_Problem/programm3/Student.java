package programm3;

class Student {
    private int studentId;
    private String studentName;
    private int[] marks = new int[3];
    private double average;
    private char grade;

    // Default constructor
    Student() {
        this.studentId = 0;
        this.studentName = "";
    }

    // Parameterized constructor
    Student(int studentId, String studentName, int[] marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
        calculateAverageAndGrade();
    }

        private void calculateAverageAndGrade() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        this.average = (double) sum / marks.length;
        if (average >= 90) {
            this.grade = 'A';
        } else if (average >= 80) {
            this.grade = 'B';
        } else if (average >= 70) {
            this.grade = 'C';
        } else if (average >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }

  
    void displayStudentDetails() {
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage: " + average);
        System.out.println("Grade: " + grade);
    }

   
    void displayStudentDetails(String studentName) {
        if (this.studentName.equals(studentName)) {
            displayStudentDetails();
        } else {
            System.out.println("Student not found");
        }
    }

    // Overloaded method to display student details by Id
    void displayStudentDetails(int studentId) {
        if (this.studentId == studentId) {
            displayStudentDetails();
        } else {
            System.out.println("Student not found");
        }
    }
}

