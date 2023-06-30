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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;


@Data
@Entity
@Table(name = "proceso_clinico")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_procesoClinic")
public class ProcesoClinic {
    @Column
    private int eficienEfica;
    private int seguridadAsis;
    private int regisClinic;
    private int centroPacien;
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_procesoClinic;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name =  "idevaluacion")
    private Evaluacion evaluacion   ;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")
    private EquipoCalidad equipo_Calidad;

    public ProcesoClinic(){}

    public ProcesoClinic(int eficienEfica, int seguridadAsis, int regisClinic, int centroPacien,
                        Long id_procesoClinic, Evaluacion evaluacion, EquipoCalidad equipo_calidad){

                    this.eficienEfica=eficienEfica;
                    this.seguridadAsis=seguridadAsis;
                    this.regisClinic=regisClinic;
                    this.centroPacien=centroPacien;
                    this.id_procesoClinic=id_procesoClinic;
                    this.evaluacion=evaluacion;
                    this.equipo_Calidad=equipo_calidad;
    }
}
