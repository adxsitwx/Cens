package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.RequerimientoAu;
@Repository
public interface RequerimientoAuRepository extends JpaRepository<RequerimientoAu, Long>{

}
