package com.example.cens.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pruebas de seguridad")
public class PruebaSeguridad {
    @Column
    private int pruebaSeg;
    private int pruebaCarga;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idPS;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")
    private Evaluacion evaluacion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")
    private EquipoCalidad equipo_calidad;

    public PruebaSeguridad(){}

    public PruebaSeguridad(int pruebaCarga, int pruebaSeg, Long idPS, Evaluacion evaluacion, EquipoCalidad equipo_calidad){

        this.pruebaSeg=pruebaSeg;
        this.pruebaCarga=pruebaCarga;
        this.idPS=idPS;
        this.evaluacion=evaluacion;
        this.equipo_calidad=equipo_calidad;
    }
}
