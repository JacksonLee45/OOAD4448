package com.Proj_one;

public class Cattle extends Bovine {
    //Subclass for all Cattle

    private Boolean hungerLvl;

    public Cattle(String cattleName) {
        //Constructor for Cattle
        name = cattleName;
        type = "Cattle";
    }

    public void setHungerLvl(Boolean hungry) { //ENCAPSULATION Example: explanation below
        this.hungerLvl = hungry;
    }

    public Boolean GetHungerLvl(Boolean hungry) {
        return this.hungerLvl;
    }

    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " says Mooo!");
    }

}

    /*
    The above private boolean attribute and getters and setters for hungerLvl is an example of Encapsulation because
        hungerLvl in this case hungerLvl is a sensitive attribute since we all know cows don't like other animals knowing if
        are hungry or not.
     */