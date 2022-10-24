package Homeworks.h01_oop.business.educator;

import java.util.ArrayList;

import Homeworks.h01_oop.entities.Educator;

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
