package repository;

import model.AquariumCreature;

public class InMemoryRepository implements IRepository {
    private AquariumCreature[] creatures;
    private int size = 0;

    public InMemoryRepository(int capacity) {

        this.creatures = new AquariumCreature[capacity];
    }

    public void add(AquariumCreature creature) throws RepositoryException{
        if (creatures.length == size){
            throw new RepositoryException("Repository is full.");
        }

        this.creatures[size++] = creature;
    }

    public void remove(int index) throws RepositoryException{
        if(index < 0 || index >= size){
            throw new RepositoryException("Invalid index");
        }

        for (int i = index; i < size-1; i++){
            creatures[i] = creatures[i+1];
        }
        creatures[--size] = null;
    }

    public AquariumCreature[] getAll(){
        AquariumCreature[] result = new AquariumCreature[size];

        for (int i = 0; i < size; i++){
            result[i] = creatures[i];
        }
        return result;
    }
}
