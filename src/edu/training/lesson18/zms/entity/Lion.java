package edu.training.lesson18.zms.entity;

import java.util.Objects;

public class Lion extends Animal {

    private String name;
    private int age;
    private int energy;

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    public void makeSound() {
        energy -= 15;
    }

    public void eat() {
        energy += 20;
    }

    public void eat(int extraEnergy) {
        energy += extraEnergy;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lion lion = (Lion) o;
        return age == lion.age && energy == lion.energy && Objects.equals(name, lion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age, energy);
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", energy=" + energy +
                '}';
    }
}
