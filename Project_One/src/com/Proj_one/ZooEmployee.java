package com.Proj_one;

abstract class ZooEmployee { //ABSTRACT CLASS EXAMPLE: explanation below
    //Abstract Class for all Zoo Employees

    String name;
    String title;

    public abstract void wakeUpAnimal(Animal[] zoo); //ABSTRACTION EXAMPLE: explanation below

    public abstract void rollCall(Animal[] zoo);

    public abstract void feedAnimals(Animal[] zoo);

    public abstract void exerciseAnimals(Animal[] zoo);

    public abstract void animalsSleep(Animal[] zoo);

    /*
    The above class is an example of an Abstract Class. This Abstract class contains abstract methods which is inherited
        by ZooKeeper which also implements the functionality of each method.
     */

    /*
    Above is an example of Abstraction because certain details have been hidden and shows only essential information
        for the sake of this file. The functional implementation has been hidden and only shows what parameters the
        function needs to take
     */

}
