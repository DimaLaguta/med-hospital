package repo.impl;

import model.Room;
import repo.RoomRepo;

import java.util.List;
import java.util.Optional;

public class RoomRepoImpl implements RoomRepo {
    @Override
    public <Child extends Room> void save(Child entity) {
    }

    @Override
    public Optional<Room> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public List<Room> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
