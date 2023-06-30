package com.example.cens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cens.models.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
