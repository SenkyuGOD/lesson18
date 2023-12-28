package edu.training.lesson18.ums.entity;

import edu.training.lesson18.ums.research.Research;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Student extends UniversityMember implements Research {
    private List<String> courseList;
    private double gpa;

    public Student(String name, int id, String email) {
        super(name, id, email);
        this.courseList = new ArrayList<>();
    }

    public void addCourse(String courseName) {
        this.courseList.add(courseName);
    }

    public List<String> getCourseList() {
        return courseList;
    }



    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void displayDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Courses: " + String.join(", ", this.courseList);
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
        Student student = (Student) o;
        return Double.compare(student.gpa, gpa) == 0 && Objects.equals(courseList, student.courseList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), courseList, gpa);
    }
}
