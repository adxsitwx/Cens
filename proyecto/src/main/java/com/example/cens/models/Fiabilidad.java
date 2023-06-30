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
@Table(name = "proceso tecnico : fiabilidad")
public class Fiabilidad {
	@Column
    private int efic;
    private int tolerancia;
    private int capac;
    private int arquitectura;
    private int otros;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFia;

    @OneToOne(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")
    private Evaluacion evaluacion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")
    private EquipoCalidad equipo_Calidad;

    public Fiabilidad(){}

    public Fiabilidad(int efic, int tolerancia, int capac, int arquitectura, int otros, Long idFia,
                    Evaluacion evaluacion, EquipoCalidad equipo_calidad){
        
        this.efic=efic;
        this.tolerancia=tolerancia;
        this.capac=capac;
        this.arquitectura=arquitectura;
        this.otros=otros;
        this.idFia=idFia;
        this.evaluacion=evaluacion;
        this.equipo_Calidad=equipo_calidad;
    }
}
