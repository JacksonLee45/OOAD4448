package com.Proj_one;

public class Elephant extends Pachyderm {
    //Subclass for all Elephants

    public Elephant(String elephantName){
        //Constructor for Elephants
        name = elephantName;
        type = "Elephant";
    }

    public void makeNoise(){
        System.out.println(this.name + " the " + this.type + " says Prrrr!");
    }

}
