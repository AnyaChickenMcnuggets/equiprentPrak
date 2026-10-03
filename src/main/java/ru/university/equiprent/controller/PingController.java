package ru.university.equiprent.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


// http://localhost:8081/swagger-ui/index.html
@RestController
@RequestMapping("/api/ping")
public class PingController {

    @GetMapping
    public String get() {
        return "pong";
    }

    @PostMapping
    public ResponseEntity<String> create() {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("created");
    }

    @PutMapping("/{id}")
    public String update(
        @PathVariable Long id) {        
        return "updated: " + id;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
        @PathVariable Long id) {        
        return ResponseEntity.noContent().build();
    }

}
