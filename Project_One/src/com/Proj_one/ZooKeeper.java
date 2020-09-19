package com.Proj_one;


public class ZooKeeper extends ZooEmployee {
    //Class for Zookeeper that implements the abstract ZooEmployee Class

    public ZooKeeper(String zookeeperName, String zookeeperTitle) { //Constructor for the Zookeeper
        name = zookeeperName;
        title = zookeeperTitle;
    }

    public void wakeUpAnimal(Animal[] zoo){ ////method to notify the user that the zookeeper is waking up the animals
        for(int i = 0; i < 20; i++) {
            System.out.println("-------");
            System.out.println(this.name + " wakes up " + zoo[i].name + " the " + zoo[i].type);
            zoo[i].wakeUp();
        }
    }

    public void rollCall(Animal[] zoo){ //method to notify the user that the zookeeper is performing a roll call
        for(int i = 0; i < 20; i++) {
            System.out.println("-------");
            System.out.println(this.name + " checks on " + zoo[i].name + " the " + zoo[i].type);
            zoo[i].makeNoise();
            System.out.println(this.name + " has noted that " + (i+1) + " out of 20 animals have been accounted for");
        }
    }

    public void feedAnimals(Animal[] zoo){ //method to notify the user that the zookeeper is feeding the animals
        for(int i = 0; i < 20; i++) {
            System.out.println("-------");
            System.out.println(this.name + " begins to feed " + zoo[i].name + " the " + zoo[i].type);
            zoo[i].eat();
        }
    }

    public void exerciseAnimals(Animal[] zoo){ //method to notify the user that the zookeeper is making the animals workout
        for(int i = 0; i < 20; i++) {
            System.out.println("-------");
            System.out.println(this.name + " makes " + zoo[i].name + " the " + zoo[i].type + " get some exercise");
            zoo[i].roam();
            }
    }

    public void animalsSleep(Animal[] zoo){ //method to notify the user that the zookeeper is putting the animals to sleep
        for(int i = 0; i < 20; i++) {
            System.out.println("-------");
            System.out.println(this.name + " has started to put " + zoo[i].name + " the " + zoo[i].type + " to sleep");
            zoo[i].sleep();
        }
    }

}
