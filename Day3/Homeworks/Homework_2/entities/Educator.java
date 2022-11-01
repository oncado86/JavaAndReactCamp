package Homeworks.Homework_2.entities;

import java.util.ArrayList;

public class Educator extends User {
    private ArrayList<String> coursesGiven;

    public Educator(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        coursesGiven = new ArrayList<>();
    }

    public ArrayList<String> getCoursesGiven() {
        return coursesGiven;
    }

    public void setCoursesGiven(String... coursesGiven) {
        for (String course : coursesGiven) {
            this.coursesGiven.add(course);
        }
    }

}
