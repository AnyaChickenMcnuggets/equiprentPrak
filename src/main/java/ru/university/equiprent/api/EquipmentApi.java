package ru.university.equiprent.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import ru.university.equiprent.model.Equipment;

@RequestMapping("/api/equipment")
@Tag(name = "Equipment Controller")
public interface EquipmentApi {
    
    @Operation(summary = "получение списка")
    @GetMapping
    public List<Equipment> getAll();

    @GetMapping("/{id}")
    public Equipment get(
            @RequestParam Long id);

    @PostMapping
    public Equipment create(
            @RequestBody Equipment entity);
}
