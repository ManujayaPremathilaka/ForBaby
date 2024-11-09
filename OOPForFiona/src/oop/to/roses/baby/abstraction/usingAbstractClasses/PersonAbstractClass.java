package oop.to.roses.baby.abstraction.usingAbstractClasses;

/**
 * Here since there is "abstract" key word in class declaration,
 * this is an abstract class
 */
public abstract class PersonAbstractClass {

    //let's declare our abstract method
    public abstract void nameForTheBaby();

    //along with the abstract method, we can have our usual methods
    public void babyCry(){
        System.out.println("She cries out like \"Mommyyyyyyy\"");
    }

    public void whatMommaAndDaddaDoWhenSheCry(){
        System.out.println("Then the Mamma and Dadda be like \"Let's sing a lullaby to our angel!\"");
    }
}
