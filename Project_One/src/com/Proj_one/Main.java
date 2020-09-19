package com.Proj_one;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {

       ZooKeeper ZK = new ZooKeeper("Zack", "Zookeeper"); //Initializes a ZooKeeper named Zack

       Animal Zoo[] = new Animal[20]; //Initializes an Array to hold all of the Animals
                                      // The Array is set to 20 to hold 2 of each of the 10 animals (The minimum amount of animals from the Project PDF)

       Zoo[0] = new Cat("Chloe");     //Each line initializes a unique animal with names that begin with the same first letter of their respective class
       Zoo[1] = new Cat("Charles");    //IDENTITY EXAMPLE: each new object gets their own identity meaning they have their own address in memory.
       Zoo[2] = new Lion("Leo");
       Zoo[3] = new Lion("Liam");
       Zoo[4] = new Tiger("Tyler");
       Zoo[5] = new Tiger("Timmy");
       Zoo[6] = new Dog("Dillon");
       Zoo[7] = new Dog("David");
       Zoo[8] = new Wolf("William");
       Zoo[9] = new Wolf("Whittier");
       Zoo[10] = new Rhino("Ryan");
       Zoo[11] = new Rhino("Reilly");
       Zoo[12] = new Elephant("Elmer");
       Zoo[13] = new Elephant("Elliot");
       Zoo[14] = new Hippo("Henry");
       Zoo[15] = new Hippo("Haley");
       Zoo[16] = new Bison("Billie");
       Zoo[17] = new Bison("Bobby");
       Zoo[18] = new Cattle("Cole");
       Zoo[19] = new Cattle("Chris");


       System.out.println("Welcome to Jackson's Zoo");
       Scanner myObj = new Scanner(System.in); //Creates a scanner object to read in how many days the user wants to simulate this Zoo
       System.out.println("How many days shall the Zoo run for? "); //Used some code and documentation from www.w3schools.com/java/java_user_input.asp
       int days = myObj.nextInt(); // reads in an integer that specifies how many days the user wants to simulate the zoo for


       for(int i = 1; i <= days; i++) {

          System.out.println('\n' + ZK.name +  " the " + ZK.title + " has arrived to the Zoo on Day " + i + '\n'); //notifies the user that Zookeeper has arrived to the zoo

          ZK.wakeUpAnimal(Zoo);

          ZK.rollCall(Zoo);

          ZK.feedAnimals(Zoo);

          ZK.exerciseAnimals(Zoo);

          ZK.animalsSleep(Zoo);

          System.out.println('\n' + ZK.name + " the " + ZK.title + " has left the Zoo" ); //notifies the user that the zookeeper has left.

       }
    }
}
