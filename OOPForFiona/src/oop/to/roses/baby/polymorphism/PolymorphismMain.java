package oop.to.roses.baby.polymorphism;

public class PolymorphismMain {
    public static void main(String[] args){
        /**
         * We are going to create objects for Parent class as well as each Child classes to represent each individual
         */
        BabyNames babyNames = new BabyNames();  // Parent class object creation
        Mommy mommy = new Mommy();              // Child class 1 object creation
        Daddy daddy = new Daddy();              // Child class 2 object creation
        UncleManu uncleManu = new UncleManu();  // Child class 3 object creation

        /**
         * Then we call the same overridden method using each object (each individual)
         * We should get different outputs even though the method
         * This happens because method body is different in every class
         */
        babyNames.babyName();
        mommy.babyName();
        daddy.babyName();
        uncleManu.babyName();
    }
}
