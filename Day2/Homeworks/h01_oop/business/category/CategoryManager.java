package Homeworks.h01_oop.business.category;

import java.util.ArrayList;

import Homeworks.h01_oop.entities.Category;

public class CategoryManager implements ICategoryManager {
    private ArrayList<Category> categories;

    public CategoryManager() {
        this.categories = new ArrayList<>();
    }

    public ArrayList<Category> getListOfCategories() {
        return categories;
    }

    @Override
    public void add(Category category) {
        categories.add(category);
    }

    @Override
    public void listCategories() {
        for (Category c : getListOfCategories()) {
            System.out.println(c.getName());
        }
    }

}
