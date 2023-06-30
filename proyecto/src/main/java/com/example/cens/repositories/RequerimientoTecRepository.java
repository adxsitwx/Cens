package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.RequerimientoTec;
@Repository
public interface RequerimientoTecRepository extends JpaRepository<RequerimientoTec, Long>{

}
