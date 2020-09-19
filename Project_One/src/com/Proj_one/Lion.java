package com.Proj_one;

public class Lion extends Feline {
    //Subclass for all Lions

    public Lion(String lionName){
        name = lionName;
        type = "Lion";
    }

    public void makeNoise(){
        System.out.println(this.name + " the " + this.type + " says Raaawr!");
    }

}
