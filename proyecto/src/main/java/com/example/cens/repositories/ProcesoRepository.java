package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.Proceso;
@Repository
public interface ProcesoRepository extends JpaRepository<Proceso, Long>{

}
