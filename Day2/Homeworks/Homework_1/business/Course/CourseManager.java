package Homeworks.Homework_1.business.Course;

import java.util.ArrayList;

import Homeworks.Homework_1.entities.Course;


public class CourseManager implements ICourse {

    private ArrayList<Course> courses = new ArrayList<>();

    @Override
    public void add(Course course) {
        this.courses.add(course);
    }

    @Override
    public void listCourse() {
        for (Course course : courses) {
            System.out.println(String.format(
                    "Kurs Adı: %s\nAçıklama: %s\nKategori: %s\nEğitmen: %s %s",
                    course.getName(), course.getDescription(), course.getCategory(),
                    course.getEducator().getFirstName(), course.getEducator().getLastName()));
        }

    }

}
