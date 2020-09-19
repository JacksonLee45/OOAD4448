package com.Proj_one;

public class Tiger extends Feline {
    //Subclass for all Tigers

    public Tiger(String tigerName) {
        //Constructor for Tiger
        name = tigerName;
        type = "Tiger";
    }

    public void makeNoise(){
        System.out.println(this.name + " the " + this.type + " says Grrrr!");
    }
}
