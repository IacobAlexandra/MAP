package controller;

import model.AquariumCreature;
import repository.IRepository;
import repository.RepositoryException;

public class Controller {
    private IRepository repo;

    public Controller(IRepository repo){
        this.repo = repo;
    }

    public void add(AquariumCreature creature) throws RepositoryException{
        repo.add(creature);
    }

    public void remove(int index) throws RepositoryException {
        repo.remove(index);
    }

    public AquariumCreature[] getAll(){ return repo.getAll(); }

    private int countOlderThanOneYear(){
        AquariumCreature[] allCreatures = repo.getAll();
        int count = 0;

        for(AquariumCreature creature : allCreatures){
            int age = creature.getAge();
            if ( age > 1){
                count++;
            }
        }

        return count;
    }
    public AquariumCreature[] getOlderThanOneYear(){
        AquariumCreature[] allCreatures = repo.getAll();
        int capacity = countOlderThanOneYear();

        AquariumCreature[] result = new AquariumCreature[capacity];
        int size = 0;

        for(AquariumCreature creature : allCreatures){
            int age = creature.getAge();
            if ( age > 1 ) {
                result[size++] = creature;
            }
        }

        return result;
    }
}
