package oop.to.roses.baby.abstraction.usingAbstractClasses;

public class BabyRoses extends PersonAbstractClass {

    /**
     * Here we are overriding the abstract method defined in "PersonAbstractClass"
     */
    @Override
    public void nameForTheBaby() {
        System.out.println("Baby likes uncle Manu's name: \"Roses\"");
    }
}
