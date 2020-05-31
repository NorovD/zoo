package ru.geekbrains.homework.zoo;
//        1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Animals {
   public String name;
    //        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
    //        В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
   public int runLength;
   public double jumpHigh;
   public int swimLength;

   public Animals(String name,int runLength, int swimLength, double jumpHigh){
       this.name=name;
       this.runLength=runLength;
       this.jumpHigh=jumpHigh;
       this.swimLength=swimLength;
   }
    //        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
    public void jumpOver(double barrierHigh){

       boolean isJumpedOver = jumpHigh>barrierHigh;
       System.out.println(name +" has jumped over " +barrierHigh+ " high barrier => " + isJumpedOver);

    }
    public void runThrough(int runningDistanceLength){
        boolean isRunningOver = runLength>runningDistanceLength;
        System.out.println(name +" has running over " + runningDistanceLength+" length distance => " + isRunningOver);

    }
    public void swimOver(int swimmingDistanceLength){
        boolean isSwimmedOver = swimLength>swimmingDistanceLength;
        System.out.println(name + " has swimmed over " + swimmingDistanceLength+ " length distance => " + isSwimmedOver);
        System.out.println(" ");
    }
}
