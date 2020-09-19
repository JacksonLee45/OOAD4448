package com.Proj_one;

public class Animal {
    //Class for all Animals

    String name;
    String type;

    public void sleep() {
        System.out.println(this.name + " the " + this.type + " has started to sleep");
    }

    public void roam() { //method to give animals exercise
        System.out.println(this.name + " the " + this.type + " has started to roam");
    }

    public void wakeUp() {
        System.out.println(this.name + " the " + this.type + " is awake");
    }

    public void eat() {
        System.out.println(this.name + " the " + this.type + " eats his food");
    }

    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " makes a lot of noise");
    }
}
