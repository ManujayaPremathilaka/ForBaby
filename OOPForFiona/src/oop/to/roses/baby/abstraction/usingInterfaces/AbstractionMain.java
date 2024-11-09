package oop.to.roses.baby.abstraction.usingInterfaces;

public class AbstractionMain {
    public static void main(String[] args){
        /**
         * First we create an object for child class
         * Then we call all the overridden methods in child class
         * Similar to the abstract classes, we can't create objects for interfaces as well
         */
        BabyRoses babyRoses = new BabyRoses();
        babyRoses.nameForTheBaby();
        babyRoses.babyCry();
        babyRoses.whatMommaAndDaddaDoWhenSheCry();
        babyRoses.cutiePie(); //here we are calling the usual method
    }
}
