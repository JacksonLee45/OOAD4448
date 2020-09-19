package com.Proj_one;
import java.util.Random;

public class Dog extends Canine{
    //Subclass for all Dogs

    public Dog(String dogName){
        //Constructor for dog

        name = dogName;
        type = "Dog";
    }

    public void roam(){ //implements the special case for Dogs
        Random rand = new Random(); //Generates a random Object
        int rand_int = rand.nextInt(100); //Produces a number in the range 0-100 (https://www.geeksforgeeks.org/generating-random-numbers-in-java/)

        if(rand_int <= 25) {
            this.dig();
        }
        else System.out.println(this.name + " the " + this.type + " to get some exercise");
    }

    public void dig() {
        System.out.println(this.name + " the " + "has begun to dig!");
    }

    public void makeNoise(){
        System.out.println(this.name + " the " + this.type + " says Woof!");
    }

}
