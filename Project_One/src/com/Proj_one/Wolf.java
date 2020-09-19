package com.Proj_one;

public class Wolf extends Canine {
    //Subclass for all Wolves

    public Wolf(String wolfName) {
        //Constructor for Wolves
        name = wolfName;
        type = "Wolf";
    }

    public void makeNoise(){
        System.out.println(this.name + " the " + this.type + " says AWWWOOOO!");
    }

}
