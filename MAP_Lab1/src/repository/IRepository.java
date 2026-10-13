package repository;

import model.AquariumCreature;

public interface IRepository {

    void add(AquariumCreature creature) throws RepositoryException;
    void remove(int index) throws RepositoryException;
    AquariumCreature[] getAll();

}
