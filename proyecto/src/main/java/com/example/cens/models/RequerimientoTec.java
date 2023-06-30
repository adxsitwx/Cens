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
@Table(name = "requerimientos_tecnicos_especificos")
public class RequerimientoTec {
    @Column
    private int diseñoTec;
    private int datosInter;
    private int descripMetod;
    private int integracion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idreqTec;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")
    private Evaluacion evaluacion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")
    private EquipoCalidad equipo_Calidad;

    public RequerimientoTec(){}

    public RequerimientoTec(int diseñoTec, int datosInter, int descripMetod, int integracion,
                            Long idreqTec, Evaluacion evaluacion, EquipoCalidad equipo_calidad){

        this.diseñoTec=diseñoTec;
        this.datosInter=datosInter;
        this.descripMetod=descripMetod;
        this.integracion=integracion;
        this.idreqTec=idreqTec;
        this.evaluacion=evaluacion;
        this.equipo_Calidad=equipo_calidad;
    }
}
