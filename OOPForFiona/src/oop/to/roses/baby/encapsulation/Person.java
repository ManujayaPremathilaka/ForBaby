package oop.to.roses.baby.encapsulation;

public class Person {

    //declare variables as private
    private String babyName = null;
    private String motherName = null;
    private String fatherName = null;

    /**
     * Add following getters and setters to get values and set values
     * to the above declared private variables
     */
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }
}
