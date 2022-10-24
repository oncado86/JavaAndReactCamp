package Homeworks.h01_oop;

import Homeworks.h01_oop.business.Course.CourseManager;

// import java.util.ArrayList;

import Homeworks.h01_oop.business.category.CategoryManager;
import Homeworks.h01_oop.business.educator.EducatorManager;
import Homeworks.h01_oop.entities.Category;
import Homeworks.h01_oop.entities.Course;
import Homeworks.h01_oop.entities.Educator;

public class Main {
    public static void main(String[] args) {
        CategoryManager categoryManager = new CategoryManager();
        EducatorManager educatorManager = new EducatorManager();
        CourseManager courseManager = new CourseManager();

        Category categoryJava = new Category(0, "Java");
        Educator educator1 = new Educator(0, "Engin", "Demiroğ");

        categoryManager.add(categoryJava);
        categoryManager.listCategories();

        educatorManager.add(educator1);

        courseManager.add(new Course(0, "Java & React Kamp", "Java ve React eğitimi", categoryJava, educator1));
        courseManager.listCourse();
    }
}
