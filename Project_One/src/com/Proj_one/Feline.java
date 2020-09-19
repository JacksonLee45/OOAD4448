package com.Proj_one;
import java.util.Random;

public class Feline extends Animal {
    //Class for all Felines (Tiger, Cat, Lion)

    public void roam(Boolean goRoam) {
        System.out.println(this.name + " the " + this.type + " begins to roam instead of sleeping!");
    }

    public void sleep() { //POLYMORPHISM and OVERRIDING EXAMPLE #1: explanation below
        Random rand = new Random(); //Generates a random Object
        int rand_int = rand.nextInt(100); //Produces a number in the range 0-100 (https://www.geeksforgeeks.org/generating-random-numbers-in-java

        if (rand_int <= 30) {
            //Feline should roam instead
            this.roam(true);
        }
        else if (rand_int <= 60) {
            //Feline should make noise instead
            this.makeNoise();
        }
        else System.out.println(this.name + " the " + this.type + " has started to Sleep ");
    }

    /*
    The above sleep() method is an example of polymorphism and more specifically overriding because sleep() is also
        defined in the Animal class. When Main.java calls ZK.animalsSleep(Zoo) which calls the sleep() on every
        animal. But when the Zookeeper calls sleep() on a Feline, the Animal Class sleep() method is overrode by
        the Feline Class sleep() implementation which provides additional functionality.
     */

}
