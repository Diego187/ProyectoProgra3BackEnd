package repository;

import entity.ClinicalCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("clinicalCenterRepository")
public interface ClinicalCenterRepository extends JpaRepository<ClinicalCenter, Serializable> {
}
