package Lesson6;

public class Dog extends Animal {
    public static String typeClass = "Собака";
    public static int countDog=0;

    public Dog(String name, int maxRun, int maxSwim) {
        super(typeClass,name, maxRun, maxSwim);
        ++countDog;

    }
}
