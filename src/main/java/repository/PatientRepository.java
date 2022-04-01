package repository;

import entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("patientRepository")
public interface PatientRepository extends JpaRepository<Patient, Serializable> {
}
