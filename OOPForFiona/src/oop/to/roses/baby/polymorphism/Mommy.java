package oop.to.roses.baby.polymorphism;

/**
 * Child class sharing the same parent class BabyNames
 */
public class Mommy extends BabyNames{

    @Override
    public void babyName() {
        System.out.println("Mommy has no idea you little princess");
    }
}
