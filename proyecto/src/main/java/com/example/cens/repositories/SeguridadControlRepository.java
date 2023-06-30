package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.SeguridadControl;
@Repository
public interface SeguridadControlRepository extends JpaRepository<SeguridadControl, Long>{

}
