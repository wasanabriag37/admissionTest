package com.sprint3.admission_test.infrastructure.adapter.out.persistence.jpaRepository;

import com.sprint3.admission_test.domain.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.time.LocalDate;

public interface MedicationJpaRepository extends JpaRepository<Medication, Long> {

    Medication findByNameAndExpirationDate(String name, LocalDate expirationDate);
}
