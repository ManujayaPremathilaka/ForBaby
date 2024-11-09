package oop.to.roses.baby.abstraction.usingInterfaces;

/**
 * Here we have defined our interface using "interface" keyword
 */
public interface PersonInterface {

    /**
     * All the methods within an interface are by default abstract
     * Therefore, we don't use abstract keyword when declaring the methods
     * Also any method cannot have its method body
     */
    public void nameForTheBaby();
    public void babyCry();
    public void whatMommaAndDaddaDoWhenSheCry();
}
