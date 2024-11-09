package oop.to.roses.baby.abstraction.usingAbstractClasses;

public class AbstractionMain {
    public static void main(String[] args){
        /**
         * Here you can't create objects for abstract class
         * But we can create an object for child class
         * Using this object we can access parent class's methods as well
         */
        BabyRoses babyRoses = new BabyRoses();
        babyRoses.nameForTheBaby(); //here we are calling the overridden abstract method
        babyRoses.babyCry();
        babyRoses.whatMommaAndDaddaDoWhenSheCry();
    }
}
