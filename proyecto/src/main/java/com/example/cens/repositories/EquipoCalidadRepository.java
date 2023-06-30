package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.EquipoCalidad;
@Repository
public interface EquipoCalidadRepository extends JpaRepository<EquipoCalidad, Long>{

}
