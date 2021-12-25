

// 1. Создать классы Собака и Кот с наследованием от класса Животное.
// 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
       // Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
// 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
        //плавание: кот не умеет плавать, собака 10 м.).
// 4. * Добавить подсчет созданных котов, собак и животных.

package Lesson6;

public class Homework6 {
    public static void main(String[] args) {

        String processAction;
        String resultAction;
        String losingResult = ".Это НЕ получилось";
        String winResult = ".Это получилось";


        Animal[] animals = {
                new Cat("Пузя",200, 0),
        new Cat("Варя",50, 0),
        new Cat("Маня",120, 0),
        new Dog("Боря",500, 10),
        new Dog("Харт",1000, 10),
        new Dog("Джейк",100, 10)
        };


        int runlenght = 350;
        int swimlenght = 5;

        for (int i = 0; i < animals.length; i++) {
            String name = animals[i].getType() + " " + animals[i].getName() + " ";
            processAction = "может пробежать на " + animals[i].getMaxRun() + ". Пытается пробежать на " + runlenght + " ";
            resultAction = animals[i].run(runlenght) ? winResult : losingResult;
            result(name, processAction, resultAction, runlenght);


            processAction = "может проплыть на " + animals[i].getMaxSwim() + ". Пытается проплыть на " + swimlenght + " ";
            resultAction = (animals[i].swim(swimlenght) == Animal.swim_ok) ? winResult : losingResult;
            if (animals[i].swim(swimlenght) == Animal.swim_none)
                resultAction = losingResult + ". Не умеет плавать";
                        result (name,processAction,resultAction,swimlenght);
        }
        System.out.println ("All animals: " + Animal.countAnimal + ". Cats: " + Cat.countCat + ".Dogs: " + Dog.countDog);
    }

    public static void result(String name, String processAction, String resultAction, int actionlenght) {
        System.out.println(name + processAction + resultAction);


    }

}
