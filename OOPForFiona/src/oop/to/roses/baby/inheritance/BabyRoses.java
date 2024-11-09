package oop.to.roses.baby.inheritance;

/**
 * Here we have extended the "ParentsOfBabyRoses"
 * Therefore, all public/protected methods/variables are inherited by the child class
 */
public class BabyRoses extends ParentsOfBabyRoses{
    private String babyName = "Roses";

    public String babyRosesName(){
        return babyName;
    }
}
