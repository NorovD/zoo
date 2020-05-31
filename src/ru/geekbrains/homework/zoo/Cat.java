package ru.geekbrains.homework.zoo;

public class Cat extends Animals {


    Cat(String name, int runLength, int swimLength, double jumpHigh){
        super(name, runLength, swimLength, jumpHigh);
    }

    @Override
    public void jumpOver(double barrierHigh) {
        super.jumpOver(barrierHigh);
    }

    @Override
    public void runThrough(int runningDistanceLength) {
        super.runThrough(runningDistanceLength);
    }

    @Override
    public void swimOver(int swimmingDistanceLength) {
        super.swimOver(swimmingDistanceLength);
    }
}
