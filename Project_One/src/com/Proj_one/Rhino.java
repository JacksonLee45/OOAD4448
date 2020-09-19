package com.Proj_one;

public class Rhino extends Pachyderm {
    //Subclass for all Rhinos

    public Rhino(String rhinoName) {
        //Constructor for Rhinos
        name = rhinoName;
        type = "Rhino";
    }


    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " says Grufff!");
    }
}
