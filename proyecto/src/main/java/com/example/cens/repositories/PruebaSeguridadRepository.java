package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.PruebaSeguridad;
@Repository
public interface PruebaSeguridadRepository extends JpaRepository<PruebaSeguridad, Long>{

}
