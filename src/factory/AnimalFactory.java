package factory;

import animals.Duck;
import animals.pets.Cat;
import animals.pets.Dog;

import java.util.Scanner;

public class AnimalFactory {
    public static Animal createAnimal(String type) {
        switch (type) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            case "duck":
                return new Duck();
            default:
                System.out.println("Некорректный тип животного!");
                return null;
        }
    }
    public int readAge(Scanner scanner) {
        int age;
        while (true) {
            try {
                System.out.println("Введите возраст:");
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 0 && age < 30) {
                    break;
                } else if (age >= 30) {
                    System.out.println("Животные столько не живут");
                } else {
                    System.out.println("Некорректный ввод! Возраст должен быть неотрицательным.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод! Возраст должен быть числом.");
            }
        }
        return age;
    }

    public double readWeight(Scanner scanner) {
        double weight;
        while (true) {
            try {
                System.out.println("Введите вес:");
                weight = Double.parseDouble(scanner.nextLine());
                if (weight >= 0 && weight < 30) {
                    break;
                } else if (weight >= 30) {
                    System.out.println("Животные столько не живут");

                } else {
                    System.out.println("Некорректный ввод! Вес должен быть неотрицательным.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод! Вес должен быть числом.");
            }
        }
        return weight;
    }
}

