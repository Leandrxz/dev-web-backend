package br.com.santaclara.repositories;

import br.com.santaclara.entities.Patient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
