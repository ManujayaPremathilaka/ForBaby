package oop.to.roses.baby.encapsulation;

public class EncapsulationMain {
    public static void main(String[] args){

        /**
         * First you need to create a constructor to access getters and setters in Person class
         * Otherwise you can't access the private variables (Don't ask why)
         * Refer to the notes if you can't remember what Constructor is
         */

        Person person = new Person();

        //first let's try accessing values before assign any
        String babyName = person.getBabyName();
        String motherName = person.getMotherName();
        String fatherName = person.getFatherName();

        //this will print "null" since we haven't set values to the private variables
        System.out.println("==================== Before setting values to private variables ==========================");
        System.out.println("Baby's name: " + babyName);
        System.out.println("Mother's name: " + motherName);
        System.out.println("Father's name: " + fatherName);

        //let's set some values to private variables and try again printing them
        person.setBabyName("Roses");
        person.setMotherName("Chamishka");
        person.setFatherName("Emalka");

        String babyNameAfter = person.getBabyName();
        String motherNameAfter = person.getMotherName();
        String fatherNameAfter = person.getFatherName();

        System.out.println("\n==================== After setting values to private variables ==========================");
        System.out.println("Baby's name: " + babyNameAfter);
        System.out.println("Mother's name: " + motherNameAfter);
        System.out.println("Father's name: " + fatherNameAfter);

    }
}
