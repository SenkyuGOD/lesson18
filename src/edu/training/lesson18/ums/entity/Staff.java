package edu.training.lesson18.ums.entity;

import java.util.Objects;

public class Staff extends UniversityMember {
    private String department;
    private String jobTitle;

    public Staff(String name, int id, String email, String department, String jobTitle) {
        super(name, id, email);
        this.department = department;
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void displayDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + this.department + ", Job Title: " + this.jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Staff staff = (Staff) o;
        return Objects.equals(department, staff.department) && Objects.equals(jobTitle, staff.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department, jobTitle);
    }
}
