package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.CalidadServicio;
@Repository
public interface CalidadServicioRepository extends JpaRepository<CalidadServicio, Long>{

}
