package animals.pets;

import factory.Animal;

public class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("Гав");
    }
}
