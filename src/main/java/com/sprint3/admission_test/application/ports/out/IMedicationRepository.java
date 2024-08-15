package com.sprint3.admission_test.application.ports.out;

import com.sprint3.admission_test.domain.model.Medication;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

public interface IMedicationRepository {

    Optional<Medication> findById(Long id);

    Medication save(Medication medication);

    Medication findByNameAndExpirationDate(String category, LocalDate date);
}
