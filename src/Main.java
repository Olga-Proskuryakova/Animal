import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

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
                    System.out.println("Введите тип животного (cat/dog/duck):");
                    String type = scanner.nextLine().toLowerCase();

                    Animal animal;

                    switch (type) {
                        case "cat":
                            animal = new Cat();
                            break;
                        case "dog":
                            animal = new Dog();
                            break;
                        case "duck":
                            animal = new Duck();
                            break;
                        default:
                            System.out.println("Некорректный тип животного!");
                            continue;
                    }

                    System.out.println("Введите имя:");
                    animal.setName(scanner.nextLine());

                    System.out.println("Введите возраст:");
                    animal.setAge(Integer.parseInt(scanner.nextLine()));

                    System.out.println("Введите вес:");
                    animal.setWeight(Double.parseDouble(scanner.nextLine()));

                    System.out.println("Введите цвет:");
                    animal.setColor(scanner.nextLine());

                    animalList.add(animal);
                    animal.Say();
                    break;
                case LIST:
                    for (Animal a : animalList) {
                        System.out.println(a.toString());
                    }
                    break;
                case EXIT:
                    System.exit(0);
            }
        }
    }
}