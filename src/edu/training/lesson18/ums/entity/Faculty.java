package edu.training.lesson18.ums.entity;

import edu.training.lesson18.ums.research.Research;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends UniversityMember implements Research {
    private String department;
    private List<String> coursesTeaching;

    public Faculty(String name, int id, String email, String department) {
        super(name, id, email);
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }

    public void assignCourse(String courseName) {
        this.coursesTeaching.add(courseName);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getCoursesTeaching() {
        return coursesTeaching;
    }



    @Override
    public void displayDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + this.department + ", Courses Teaching: " + String.join(", ", this.coursesTeaching);
    }

    @Override
    public void conductResearch() {
        System.out.println("Conducting research...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(department, faculty.department) && Objects.equals(coursesTeaching, faculty.coursesTeaching);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department, coursesTeaching);
    }
}
