package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.InstitucionTra;
@Repository
public interface InstitucionTraRepository extends JpaRepository<InstitucionTra, Long>{

}
