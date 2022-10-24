package Homeworks.Homework_2.entities;

import java.util.ArrayList;

public class Student extends User {
    private ArrayList<String> coursesTaken;

    public Student(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        coursesTaken = new ArrayList<>();
    }

    public ArrayList<String> getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(String... coursesTaken) {
        for (String course : coursesTaken) {
            this.coursesTaken.add(course);
        }
    }

}
