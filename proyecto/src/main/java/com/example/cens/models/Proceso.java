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
@Table(name = "proceso clinico")
public class Proceso {
    
    @Column
    private int consentimiento;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idPC;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")
    private Evaluacion evaluacion;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "email")
    private EquipoCalidad equipo_Calidad;

    public Proceso(){}

    public Proceso(int consentimiento, Long idPC, Evaluacion evaluacion, EquipoCalidad equipo_calidad){

        this.consentimiento=consentimiento;
        this.idPC=idPC;
        this.evaluacion=evaluacion;
        this.equipo_Calidad=equipo_calidad;
    }
}
