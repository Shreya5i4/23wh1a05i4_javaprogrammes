/*6. You are creating a student grading system. Each student has a name, student ID, and a list
of marks for different subjects. Implement a class in Java to represent a student and display
the student’s name who is having highest score.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private String studentID;
    private List<Integer> marks;

    public Student(String name, String studentID, List<Integer> marks) {
        this.name = name;
        this.studentID = studentID;
        this.marks = marks;
    }

    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public String getName() {
        return name;
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter student ID of student " + (i + 1) + ": ");
            String studentID = scanner.nextLine();

            System.out.print("Enter number of subjects: ");
            int numberOfSubjects = scanner.nextInt();
            List<Integer> marks = new ArrayList<>();

            System.out.println("Enter marks for " + numberOfSubjects + " subjects:");
            for (int j = 0; j < numberOfSubjects; j++) {
                marks.add(scanner.nextInt());
            }
            scanner.nextLine(); 

            students.add(new Student(name, studentID, marks));
        }

        Student topStudent = null;
        int highestScore = -1;

        for (Student student : students) {
            int totalMarks = student.getTotalMarks();
            if (totalMarks > highestScore) {
                highestScore = totalMarks;
                topStudent = student;
            }
        }

        if (topStudent != null) {
            System.out.println("Student with the highest score: " + topStudent.getName() + " with total marks: " + highestScore);
        }

        scanner.close();
    }
}
