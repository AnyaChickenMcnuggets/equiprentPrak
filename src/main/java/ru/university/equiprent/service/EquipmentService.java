package ru.university.equiprent.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ru.university.equiprent.model.Equipment;

@Service
@RequiredArgsConstructor
public class EquipmentService {
    private final IdGeneratorService 
    idGeneratorService;
    private final Map<Long, Equipment> storage = 
    new ConcurrentHashMap<>();

    public List<Equipment> findAll() {
        return List.copyOf(storage.values());
    }

    public Equipment findById(Long id) {
        return storage.get(id);
    }

    public Equipment create(Equipment equipment){
        equipment.setId(
            idGeneratorService.next());
        storage.put(equipment.getId(), 
        equipment);
        return equipment;
    }
}
