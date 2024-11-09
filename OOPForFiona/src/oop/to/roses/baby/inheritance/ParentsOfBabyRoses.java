package oop.to.roses.baby.inheritance;

public class ParentsOfBabyRoses {
    protected String daddyName = "Emalka";
    protected String daddySurname = "Wijayasiri";
    protected String mommyName = "Chamishka";
    protected String mommySurname = "Dissanayaka";

    public void mommyFullName(){
        System.out.println(mommyName + " " + mommySurname);
    }

    public void daddyFullName(){
        System.out.println(daddyName + " " + daddySurname);
    }
}
