package Homeworks.Homework_1.business.educator;

import java.util.ArrayList;

import Homeworks.Homework_1.entities.Educator;


public class EducatorManager implements IEducatorManager {

    private ArrayList<Educator> educators;

    public EducatorManager() {
        this.educators = new ArrayList<>();
    }

    @Override
    public void add(Educator educator) {
        this.educators.add(educator);
    }

}
