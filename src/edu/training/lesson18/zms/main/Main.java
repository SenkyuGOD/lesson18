package edu.training.lesson18.zms.main;

import edu.training.lesson18.zms.entity.Elephant;
import edu.training.lesson18.zms.entity.Lion;
import edu.training.lesson18.zms.entity.Monkey;
import edu.training.lesson18.zms.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion("Leo", 5);
        Elephant elephant = new Elephant("Dumbo", 10);
        Monkey monkey = new Monkey("George", 3);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);

        zoo.simulateDay();

        zoo.simulateDay();

        zoo.simulateDay();

        zoo.showEnergy();
    }
}