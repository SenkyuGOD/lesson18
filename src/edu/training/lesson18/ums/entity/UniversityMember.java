package edu.training.lesson18.ums.entity;

import java.util.Objects;

public abstract class UniversityMember {
    private String name;
    private int id;
    private String email;

    public UniversityMember() {
    }

    public UniversityMember(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public abstract void displayDetails();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniversityMember that = (UniversityMember) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, email);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", ID: " + this.id + ", Email: " + this.email;
    }
}
