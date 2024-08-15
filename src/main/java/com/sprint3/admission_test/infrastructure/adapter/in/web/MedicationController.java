package com.sprint3.admission_test.infrastructure.adapter.in.web;

import com.sprint3.admission_test.application.ports.in.IMedicationUseCase;
import com.sprint3.admission_test.domain.model.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;


@RestController
@RequestMapping("/api/medications")
public class MedicationController {

    @Autowired
    private IMedicationUseCase medicationUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<Medication> getMedicationById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(medicationUseCase.getMedicationById(id));
    }

    @PostMapping
    public ResponseEntity<?> CreatedMedication(@RequestBody Medication medication) {
        System.out.println(medication);
        return ResponseEntity.status(HttpStatus.CREATED).body(medicationUseCase.createdMedication(medication));
    }

    @GetMapping("/{category}/{date}")
    public ResponseEntity<Medication> getMedicationByCategory(@PathVariable String category, @PathVariable LocalDate date) {
        return ResponseEntity.status(HttpStatus.OK).body(medicationUseCase.getMedicationByCategory(category, date));
    }


}
