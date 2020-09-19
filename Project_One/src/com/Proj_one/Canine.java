package com.Proj_one;

public class Canine extends Animal {
    //Subclass for all Canines (Wolf, Dog)


    public void roam(){
        //Animal should roam to get exercise
        System.out.println(this.name + " the " + this.type + "begins to roam");
    }
}
