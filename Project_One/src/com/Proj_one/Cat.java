package com.Proj_one;

public class Cat extends Feline {
    //Subclass for all Cats

    public Cat(String catName) {
        name = catName;
        type = "Cat";
    }

    public void makeNoise(){ //OVERRIDING EXAMPLE #2: explanation below
        System.out.println(this.name + " the " + this.type + " says Meeooww!");
    }
}

    /*
    makeNoise() is an example of overriding because the Animal Class also has an
        implementation of makeNoise(). Whenever the zookeeper calls makeNoise() on
        a Cat, the Cat Class implementation of makeNoise() overrides Animal's
        overriding.
    */
