package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.Fiabilidad;
@Repository
public interface FiabilidadRepository extends JpaRepository<Fiabilidad, Long>{

}
