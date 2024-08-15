package com.sprint3.admission_test.application.ports.in;

import com.sprint3.admission_test.domain.model.Medication;
import org.springframework.http.ResponseEntity;

import java.sql.Date;
import java.time.LocalDate;

public interface IMedicationUseCase {
    Medication getMedicationById(Long id);
    Medication createdMedication(Medication medication);

    Medication getMedicationByCategory(String category, LocalDate date);
    //Medication GetMedicationByCategory(String category);


}
