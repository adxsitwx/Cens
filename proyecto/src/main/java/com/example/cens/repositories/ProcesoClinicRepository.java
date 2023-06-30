package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.ProcesoClinic;
@Repository
public interface ProcesoClinicRepository extends JpaRepository<ProcesoClinic, Long>{

}
