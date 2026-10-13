package view;

import controller.Controller;
import repository.IRepository;
import repository.InMemoryRepository;
import repository.RepositoryException;
import model.*;

//8. An aquarium houses fish and turtles.
//Display all the creatures in the aquarium that are older than 1 year.

public class Main {
    IRepository repo = new InMemoryRepository(10);
    Controller controller = new Controller(repo);

    void main(){

        try{
            controller.add(new Fish(0, "NemoFish"));
            controller.add(new Fish(1, "BobbyFish"));
            controller.add(new Fish(5, "WoopyFish"));
            controller.add(new Turtle(3, "HarryTurtle"));
            controller.add(new Turtle(40, "GrannyTurtle"));
        }
        catch(RepositoryException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Creatures older than 1 year:");

        for (AquariumCreature creature : controller.getOlderThanOneYear()){
            System.out.println(creature);
        }
    }
}