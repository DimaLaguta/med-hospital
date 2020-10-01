package repo.impl;

import model.Equipment;
import repo.EquipmentRepo;

import java.util.List;
import java.util.Optional;

public class EquipmentRepoImpl implements EquipmentRepo {
    @Override
    public <Child extends Equipment> void save(Child entity) {

    }

    @Override
    public Optional<Equipment> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public List<Equipment> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
