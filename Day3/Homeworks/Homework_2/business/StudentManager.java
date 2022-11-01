package Homeworks.Homework_2.business;

import Homeworks.Homework_2.entities.Student;

public class StudentManager extends UserManager {
    public void add(Student student) {
        System.out.println("\nÖğrenci eklendi: %s %s".formatted(student.getFirstName(), student.getLastName()));
    }

    public void listCourse(Student student) {
        System.out.println("\n%s %s aldığı kurslar:".formatted(student.getFirstName(), student.getLastName()));
        for (String course : student.getCoursesTaken()) {
            System.out.println(course);
        }
    }
}
