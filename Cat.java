package Lesson6;

public class Cat extends Animal {
   public static String typeClass = "Кот";
   public static int countCat=0;

    Cat(String name, int maxRun, int maxSwim) {
        super(typeClass, name,maxRun,maxSwim);
        ++countCat;
    }


    @Override
    protected int swim (int swimlenght) {
        return Animal.swim_none;
    }
    }


