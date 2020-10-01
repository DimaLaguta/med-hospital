package repo.impl;

import model.Building;
import repo.BuildingRepo;

import java.util.List;
import java.util.Optional;

public class BuildingRepoImpl implements BuildingRepo {

    @Override
    public <Child extends Building> void save(Child entity) {
    }

    @Override
    public Optional<Building> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public List<Building> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
