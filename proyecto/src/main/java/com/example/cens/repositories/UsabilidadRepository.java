package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.Usabilidad;
@Repository
public interface UsabilidadRepository extends JpaRepository<Usabilidad, Long>{

}
