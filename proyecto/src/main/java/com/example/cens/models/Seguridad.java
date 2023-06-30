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
@Table(name = "proceso tecnico:seguridad")
public class Seguridad {
    @Column
    private int autenticacion;
    private int autorizacion;
    private int cripto;
    private int gestion;
    private int integridad;
    private int autenticidad;
    private int riesgo;
    private int document;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSeg;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")
    private Evaluacion evaluacion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")
    private EquipoCalidad equipo_Calidad;

    public Seguridad(int autenticacion, int autorizacion, int cripto, int gestion, int integridad,
                    int autenticidad, int riesgo, int document, Long idSeg, Evaluacion evaluacion, EquipoCalidad equipo_calidad){
        
        this.autenticacion=autenticacion;
        this.autorizacion=autorizacion;
        this.cripto=cripto;
        this.gestion=gestion;
        this.integridad=integridad;
        this.autenticidad=autenticidad;
        this.riesgo=riesgo;
        this.document=document;
        this.idSeg=idSeg;
        this.evaluacion=evaluacion;
        this.equipo_Calidad=equipo_calidad;
    }
}
