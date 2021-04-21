package services;

import entities.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private List<Student> students = null;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Class: ");
            String cl = sc.nextLine();
            double maths = -1, physics = -1, chemistry = -1;

            do {
                try {
                    System.out.print("Maths: ");
                    maths = Double.parseDouble(sc.nextLine());
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            } while (maths < 0 || maths > 10);

            do {
                try {
                    System.out.print("Physics: ");
                    physics = Double.parseDouble(sc.nextLine());
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            } while (physics < 0 || physics > 10);

            do {
                try {
                    System.out.print("Chemistry: ");
                    chemistry = Double.parseDouble(sc.nextLine());
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            } while (chemistry < 0 || chemistry > 10);

            students.add(new Student(name, cl, maths, physics, chemistry));

            System.out.print("Press x to exit");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("x")) {
                break;
            }
        }
        sc.close();
    }

    public void display() {
        if (students.size() > 0) {
            System.out.println("Students List");
            for (var student : students) {
                System.out.println("\nName: " + student.getName());
                System.out.println("Class: " + student.getCl());
                System.out.println("Average: " + student.getAVG());
                System.out.println("Grade: " + student.getGrade());
            }
            System.out.println("--------Classification Info --------");
            classificationStudents();
        } else {
            System.out.println("No student in list");
        }

    }

    public void classificationStudents() {
        if (students.size() > 0) {
            int typeA = 0, typeB = 0, typeC = 0, typeD = 0;
            for (var student : students) {
                if (student.getGrade().equals("A")) {
                    typeA++;
                }
                if (student.getGrade().equals("B")) {
                    typeB++;
                }
                if (student.getGrade().equals("C")) {
                    typeC++;
                }
                if (student.getGrade().equals("D")) {
                    typeD++;
                }
            }
            int totalStudents = students.size();
            System.out.println("A " + typeA * 100 / totalStudents);
            System.out.println("B " + typeB * 100 / totalStudents);
            System.out.println("C " + typeC * 100 / totalStudents);
            System.out.println("D " + typeD * 100 / totalStudents);
        } else {
            System.out.println("No students");
        }

    }

}
