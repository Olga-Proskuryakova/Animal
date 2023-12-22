import factory.Animal;
import factory.AnimalFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static AnimalFactory animalFactory;

    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        AnimalFactory animalFactory = new AnimalFactory();

        while (true) {
            System.out.println("Введите команду (add/list/exit):");
            String input = scanner.nextLine().trim().toUpperCase();

            Command command;

            try {
                command = Command.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректная команда!");
                continue;
            }

            switch (command) {
                case ADD:
                    String type;
                    while (true) {
                        System.out.println("Введите тип животного (cat/dog/duck):");
                        type = scanner.nextLine().toLowerCase();
                        if ("cat".equals("cat") || type.equals("dog") || type.equals("duck")) {
                            break;
                        } else {
                            System.out.println("Некорректный тип животного!");
                        }
                    }

                    Animal animal = AnimalFactory.createAnimal(type);
                    if (animal == null) {
                        continue;
                    }

                    System.out.println("Введите имя:");
                    animal.setName(scanner.nextLine());
                    
                    //System.out.println("Введите возраст:");
                    //animal.setAge(Integer.parseInt(scanner.nextLine()));
                    int age = animalFactory.readAge(scanner);
                    animal.setAge(age);

                    //System.out.println("Введите вес:");
                    //animal.setWeight(Double.parseDouble(scanner.nextLine()));
                    double weight = animalFactory.readWeight(scanner);
                    animal.setWeight(weight);

                    System.out.println("Введите цвет:");
                    animal.setColor(scanner.nextLine());

                    animalList.add(animal);
                    animal.say();
                    break;
                case LIST:
                    for (Animal a : animalList) {
                        System.out.println(a.toString());
                    }
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + command);
            }
        }
    }

    public static void setAnimalFactory(factory.AnimalFactory animalFactory) {
        Main.animalFactory = animalFactory;
    }
}