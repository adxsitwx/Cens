package com.example.cens.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "administrador")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String rut;


    public Admin() {};
    public Admin(String name, String email, String password, String rut){
        this.name=name;
        this.email=email;
        this.password=password;
        this.rut=rut;
    }
}
