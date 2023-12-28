package edu.training.lesson18.zms.entity;

import java.util.Objects;

public class Elephant extends Animal {

    private String name;
    private int age;
    private int energy;

    public Elephant(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    public void makeSound() {
        energy -= 25;
    }

    public void eat() {
        energy += 30;
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
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", energy=" + energy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Elephant elephant = (Elephant) o;
        return age == elephant.age && energy == elephant.energy && Objects.equals(name, elephant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age, energy);
    }
}
