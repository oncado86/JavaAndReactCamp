package Homeworks.Homework_2;

import Homeworks.Homework_2.business.EducatorManager;
import Homeworks.Homework_2.business.StudentManager;
import Homeworks.Homework_2.entities.Educator;
import Homeworks.Homework_2.entities.Student;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        EducatorManager educatorManager = new EducatorManager();

        Student student = new Student(0, "OnCaDo", "OnCaDo");
        Educator educator = new Educator(0, "Engin", "Demiroğ");

        educator.setCoursesGiven("Java", "React", "Python", "C#");
        educatorManager.add(educator);
        educatorManager.listCourse(educator);

        student.setCoursesTaken("Java", "React");
        studentManager.add(student);
        studentManager.listCourse(student);
    }

}
