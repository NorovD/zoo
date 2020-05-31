package ru.geekbrains.homework.zoo;

public class Main {

    public static void main(String[] args) {



//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
        Cat cat1 = new Cat("Boris", 200, 0,2.0);
        Dog dog1 = new Dog("Barkly",500, 10, 0.5);
        //        5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
        Cat cat2 = new Cat("Felix",240,2,3.50);
        Cat cat3 = new Cat("Lucky", 170, 0,1.5);
        Dog dog2 = new Dog("Max", 450, 12, 0.1);
        Dog dog3 = new Dog("Ivan", 560, 17, 3.4);


        cat1.jumpOver(1);
        cat1.runThrough(190);
        cat1.swimOver(2);

        cat2.jumpOver(2);
        cat2.runThrough(290);
        cat2.swimOver(1);

        cat3.jumpOver(1.2);
        cat3.runThrough(390);
        cat3.swimOver(4);


        dog1.jumpOver(1.6);
        dog1.runThrough(650);
        dog1.swimOver(2);

        dog2.jumpOver(0.6);
        dog2.runThrough(350);
        dog2.swimOver(4);

        dog3.jumpOver(2.6);
        dog3.runThrough(550);
        dog3.swimOver(4);





    }
}
