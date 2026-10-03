package ru.university.equiprent.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import ru.university.equiprent.api.EquipmentApi;
import ru.university.equiprent.model.Equipment;
import ru.university.equiprent.service.EquipmentService;

@RequiredArgsConstructor
@RestController
public class EquipmentController implements EquipmentApi {
    private final EquipmentService service;

    
    public List<Equipment> getAll() {
        return service.findAll();
    }

    public Equipment get(Long id) {
        return service.findById(id);
    }

    public Equipment create(Equipment entity) {
        return service.create(entity);
    }

}
