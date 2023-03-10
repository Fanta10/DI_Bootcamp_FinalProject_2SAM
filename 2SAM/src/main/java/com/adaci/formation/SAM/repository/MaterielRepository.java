package com.adaci.formation.SAM.repository;

import com.adaci.formation.SAM.models.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Long> {
    Optional<Materiel> findByCode(String code);
}
