package Homeworks.h01_oop.entities;

public class Course {
    private int id;
    private String name;
    private String description;
    private Category category;
    private Educator educator;

    public Course(int id, String name, String description, Category category, Educator educator) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.educator = educator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Educator getEducator() {
        return educator;
    }

    public void setEducator(Educator educator) {
        this.educator = educator;
    }

}
