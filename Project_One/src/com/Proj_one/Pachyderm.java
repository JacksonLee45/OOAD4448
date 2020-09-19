package com.Proj_one;

import java.util.Random;

public class Pachyderm extends Animal {
    //Class for all Pachyderms (Rhino, Hippo)


    public void roam() {
        Random rand = new Random();
        int Rand_int = rand.nextInt(100); //Produces a number in the range 0-100 (https://www.geeksforgeeks.org/generating-random-numbers-in-java

        if(Rand_int <= 25) { //Applies the 25% chance of a Pachyderm charging special case
            this.charge();
        }
        else {
            System.out.println(this.name + " the " + this.type + " begins to roam");
        }
    }

    public void charge() {
        System.out.println(this.name + " the " + this.type + " charges at the Zookeeper!");
    }
}
