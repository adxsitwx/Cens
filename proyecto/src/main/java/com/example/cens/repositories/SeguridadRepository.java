package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.Seguridad;
@Repository
public interface SeguridadRepository extends JpaRepository<Seguridad, Long>{

}
