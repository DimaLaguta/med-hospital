package service.impl;

import exception.NotFoundException;
import model.Equipment;
import repo.EquipmentRepo;
import repo.impl.EquipmentRepoImpl;
import service.EquipmentService;

import java.util.List;

public class EquipmentServiceImpl implements EquipmentService {
    private final EquipmentRepo equipmentRepo = new EquipmentRepoImpl();

    public void create(Equipment equipment) {
        equipmentRepo.save(equipment);
    }

    public Equipment getById(Integer id) {
        return equipmentRepo.findById(id).orElseThrow(() -> new NotFoundException("Equipment not found"));
    }

    public List<Equipment> getAll() {
        return null;
    }

    public void update(Equipment equipment) {

    }

    public void deleteById(Integer id) {

    }
}
