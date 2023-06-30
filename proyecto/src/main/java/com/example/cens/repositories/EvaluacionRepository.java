package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.Evaluacion;
@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long>{

}
