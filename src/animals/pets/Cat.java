package animals.pets;

import factory.Animal;

public class Cat extends Animal {
    @Override
    public void say() {
        System.out.println("Мяу");
    }
}