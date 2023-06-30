package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.Compatibilidad;
@Repository
public interface CompatibilidadRepository extends JpaRepository<Compatibilidad, Long>{

}
