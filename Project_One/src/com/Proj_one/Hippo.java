package com.Proj_one;

public class Hippo extends Pachyderm {
    //Subclass for all Hippos

    public Hippo(String hippoName) {
        //Constructor for Hippos
        name = hippoName;
        type = "Hippo";
    }

    public void makeNoise(){
        System.out.println(this.name + " the " + this.type + " says Hipp Hipp!");
    }

}
