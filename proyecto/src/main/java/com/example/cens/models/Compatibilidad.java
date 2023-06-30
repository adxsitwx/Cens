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
@Table(name = "proceso tecnico:compatibilidad")
public class Compatibilidad {
	@Column
    private int interoperabilidad;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCom;

    @OneToOne(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")
    private Evaluacion evaluacion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")
    private EquipoCalidad equipo_Calidad;

    public Compatibilidad(){}

    public Compatibilidad(int interoperabilidad, Long idCom, Evaluacion evaluacion, EquipoCalidad equipo_calidad){
        
        this.interoperabilidad=interoperabilidad;
        this.idCom=idCom;
        this.evaluacion=evaluacion;
        this.equipo_Calidad=equipo_calidad;
    }
}
