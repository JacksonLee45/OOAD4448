package com.Proj_one;

public class Bison extends Bovine {
    //Subclass for all Bison

    public Bison(String bisonName) {
        //Constructor for Bison
        name = bisonName;
        type = "Bison";
    }

    public void makeNoise()
    {
        System.out.println(this.name + " the " + this.type + " says MOOOOO!");
    }

}
