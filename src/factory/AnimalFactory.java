package factory;

import java.util.Scanner;

public class AnimalFactory {
    public Animal createAnimal(String type) {
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
                if (age >= 0) {
                    break;
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
                if (weight >= 0) {
                    break;
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

