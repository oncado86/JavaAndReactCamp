package Homeworks.Homework_1;

import Homeworks.Homework_1.business.Course.CourseManager;
import Homeworks.Homework_1.business.category.CategoryManager;
import Homeworks.Homework_1.business.educator.EducatorManager;
import Homeworks.Homework_1.entities.Category;
import Homeworks.Homework_1.entities.Course;
import Homeworks.Homework_1.entities.Educator;

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
