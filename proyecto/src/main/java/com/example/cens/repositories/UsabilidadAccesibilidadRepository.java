package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.UsabilidadAccesibilidad;
@Repository
public interface UsabilidadAccesibilidadRepository extends JpaRepository<UsabilidadAccesibilidad, Long>{

}
