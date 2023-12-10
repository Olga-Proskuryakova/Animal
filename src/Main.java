import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();


        while (true) {
            System.out.println("Введите команду (add/list/exit):");
            String input = scanner.nextLine().trim().toUpperCase();

            try {
                Command command = Command.valueOf(input);
                switch (command) {
                    case ADD:
                        System.out.println("Введите тип животного (cat/dog/duck):");
                        String type = scanner.nextLine().trim().toLowerCase();
                        System.out.println("Введите имя:");
                        String name = scanner.nextLine().trim();
                        System.out.println("Введите возраст:");
                        int age = Integer.parseInt(scanner.nextLine().trim());
                        System.out.println("Введите вес:");
                        double weight = Double.parseDouble(scanner.nextLine().trim());
                        System.out.println("Введите цвет:");
                        String color = scanner.nextLine().trim();

                        Animal animal;
                        switch (type) {
                            case "cat":
                                animal = new Cat(name, age, weight, color);
                                break;
                            case "dog":
                                animal = new Dog(name, age, weight, color);
                                break;
                            case "duck":
                                animal = new Duck(name, age, weight, color);
                                break;
                            default:
                                System.out.println("Неверный тип животного");
                                continue;
                        }

                        animals.add(animal);
                        animal.say();
                        break;
                    case LIST:
                        for (Animal a : animals) {
                            System.out.println(a.toString());
                        }
                        break;
                    case EXIT:
                        return;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Неверная команда");
            }
        }
    }
}