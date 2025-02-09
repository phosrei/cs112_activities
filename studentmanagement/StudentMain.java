package studentmanagement;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = {new Student(), new Student()}; // an array consisting of student objects

        fillStudentInfo(students, scanner);

        System.out.println();
        for (int i = 0; i < 2; i++) { // loop to remove a subject two times
            System.out.printf("REMOVE TWO SUBJECTS FOR STUDENT ONE (%d): ", i + 1);
            students[0].removeSubject(scanner.nextLine());
        }

        System.out.print("\nADD A SUBJECT FOR STUDENT TWO: ");
        students[1].addSubject(scanner.nextLine());
        students[1].promoteYearLevel();

        System.out.println("\nSTUDENT TWO YEAR LEVEL PROMOTED");

        displayStudentInfo(students);
    }

    private static void fillStudentInfo(Student[] students, Scanner scanner) {
        // loops through the array of student objects and fills information
        for (int i = 0; i < students.length; i++) {
            System.out.println("\n------------------------");
            System.out.printf("%14s %d: %n%n", "STUDENT", i + 1);

            System.out.print("ID Number: ");
            students[i].setIdNumber(scanner.nextLine());
            System.out.print("Name: ");
            students[i].setName(scanner.nextLine());
            System.out.print("Course: ");
            students[i].setCourse(scanner.nextLine());
            System.out.print("Year: ");
            students[i].setYear(Integer.parseInt(scanner.nextLine()));
            System.out.print("No. Of Subjects: ");
            students[i].setNumOfSubjects(Integer.parseInt(scanner.nextLine()));

            // add subjects student.getNumOfSubjects() amount of times
            for (int j = 1; j <= students[i].getNumOfSubjects(); j++) {
                System.out.printf("Enter Subject %d: ", j);
                String subject = scanner.nextLine();
                students[i].addSubject(subject);
            }
        }
    }

    private static void displayStudentInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("\n------------------------");
            System.out.printf("%14s %d: %n", "STUDENT", i + 1);
            System.out.println(students[i]); //toString of student object in current iteration
        }
    }
}
