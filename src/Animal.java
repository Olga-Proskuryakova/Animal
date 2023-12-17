abstract class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() { return color; }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) { this.color = color; }

    public abstract void Say();

    public void Go() {
        System.out.println("Я иду");
    }

    public void Drink() {
        System.out.println("Я пью");
    }

    public void Eat() {
        System.out.println("Я ем");
    }
    @Override
    public String toString() {
        String ageStr;
        if (age % 10 == 1 && age != 11) {
            ageStr = age + " год";
        } else if (age % 10 >= 2 && age % 10 <= 4 && !(age >= 12 && age <= 14)) {
            ageStr = age + " года";
        } else {
            ageStr = age + " лет";
        }
        return "Привет! меня зовут " + name + ", мне " + ageStr + ", я вешу - " + weight + " кг, мой цвет - " + color;
    }

    public abstract void Fly();
}