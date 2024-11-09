package oop.to.roses.baby.polymorphism;

/**
 * Child class sharing the same parent class BabyNames
 */
public class Daddy extends BabyNames {

    @Override
    public void babyName() {
        System.out.println("Daddy also has no idea my peaches");
    }
}
