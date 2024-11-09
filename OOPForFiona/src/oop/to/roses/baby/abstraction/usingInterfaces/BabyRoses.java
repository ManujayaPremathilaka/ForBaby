package oop.to.roses.baby.abstraction.usingInterfaces;

/**
 * Since we are extending the interface "PersonInterface",
 * we have to override all the methods define in the interface itself
 */
public class BabyRoses implements PersonInterface{

    @Override
    public void nameForTheBaby() {
        System.out.println("My name is \"Roses\"");
    }

    @Override
    public void babyCry() {
        System.out.println("I always cry looking for \"Mommyyyyyyy\"");
    }

    @Override
    public void whatMommaAndDaddaDoWhenSheCry() {
        System.out.println("When I cry, Mommy and Daddy sing me songs. How cute they are!!!");
    }

    //we can have other usual methods other than these overridden methods
    public void cutiePie(){
        System.out.println("But I am the cutest. Aren't I?");
    }
}
