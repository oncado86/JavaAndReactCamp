package Homeworks.Homework_2.business;

import Homeworks.Homework_2.entities.Educator;

public class EducatorManager extends UserManager {
    public void add(Educator educator) {
        System.out.println("\nEğitmen eklendi: %s %s".formatted(educator.getFirstName(), educator.getLastName()));
    }

    public void listCourse(Educator educator) {
        System.out.println("\n%s %s verdiği kurslar:".formatted(educator.getFirstName(), educator.getLastName()));
        for (String course : educator.getCoursesGiven()) {
            System.out.println(course);
        }
    }
}
