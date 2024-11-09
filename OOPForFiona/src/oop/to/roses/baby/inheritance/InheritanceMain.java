package oop.to.roses.baby.inheritance;

public class InheritanceMain {
    public static void main(String[] args){
        //first, we need to create a Child class object to access methods and variables
        BabyRoses babyRoses = new BabyRoses();

        /**
         * Using the child class object, we can access its parent class variables and methods
         * This is achieved even without creating an object of Parent class
         * It is achievable because of OOP concept Inheritance. Child inherits everything of its parent
         */
        System.out.print("Mommy's full name: ");
        babyRoses.mommyFullName(); // using child class object, we have called a method in its parent class
        System.out.print("Daddy's full name: ");
        babyRoses.daddyFullName();

        //using the same child class object, we have called a method in child class as well as a variable in parent class
        //to print Roses full name
        System.out.print("And my full name is: " + babyRoses.babyRosesName() + " " + babyRoses.daddySurname);
    }
}
