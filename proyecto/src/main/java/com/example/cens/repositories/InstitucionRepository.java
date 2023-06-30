package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.Institucion;
@Repository
public interface InstitucionRepository extends JpaRepository<Institucion, Long>{

}
