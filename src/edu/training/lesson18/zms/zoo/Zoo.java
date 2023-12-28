package edu.training.lesson18.zms.zoo;

import edu.training.lesson18.zms.entity.Animal;
import edu.training.lesson18.zms.entity.Elephant;
import edu.training.lesson18.zms.entity.Lion;
import edu.training.lesson18.zms.entity.Monkey;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void simulateDay() {
        for (Animal animal : animals) {
            if (animal instanceof Lion) {
                ((Lion) animal).makeSound();

                if (animal.getEnergy() < 70) {
                    ((Lion) animal).eat();
                }
            } else if (animal instanceof Monkey) {
                ((Monkey) animal).makeSound();

                if (animal.getEnergy() < 60) {
                    ((Monkey) animal).eat();
                }
            } else if (animal instanceof Elephant) {
                ((Elephant) animal).makeSound();

                if (animal.getEnergy() < 50) {
                    ((Elephant) animal).eat();
                }
            }
        }
    }

    public void showEnergy() {
        for (Animal animal: animals) {
            System.out.println(animal.getName() + " " + animal.getEnergy());
        }
    }
}
