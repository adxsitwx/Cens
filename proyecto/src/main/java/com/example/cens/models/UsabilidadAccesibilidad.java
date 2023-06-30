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
@Table(name = "usababilidad y accesibilidad")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idUsabilidad")
public class UsabilidadAccesibilidad {
    @Column
    private int manualUsuario;
    private int guiaUso;
    private int mecanis;
    private int mesaAyuda;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsabilidad;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")
    private Institucion instutución;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")
    private EquipoCalidad equipo_Calidad;

    public UsabilidadAccesibilidad(){}

    public UsabilidadAccesibilidad(int manualUsuario, int guiaUso, int mecanis, int mesaAyuda, Long idUsabilidad,
                    Institucion instutución, EquipoCalidad equipo_calidad){
        this.manualUsuario=manualUsuario;
        this.guiaUso=guiaUso;
        this.mecanis=mecanis;
        this.mesaAyuda=mesaAyuda;
        this.idUsabilidad=idUsabilidad;
        this.instutución=instutución;
        this.equipo_Calidad=equipo_calidad;
    }
}
