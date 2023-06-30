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
@Table(name = "proceso tecnico : usabilidad")
public class Usabilidad {
    
    @Column
    private int pruebasUsuario;
    private int erroresUsuario;
    private int capacidadApren;
    private int usabilidadCol;
    private int accesibilidad;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsa;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")
    private Evaluacion evaluacion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")
    private EquipoCalidad equipo_Calidad;

    public Usabilidad(int pruebasUsuario, int erroresUsuario, int capacidadApren, int usabilidadCol, int accesibilidad,
                    Long idUsa, Evaluacion evaluacion, EquipoCalidad equipo_calidad){
        
        this.pruebasUsuario=pruebasUsuario;
        this.erroresUsuario=erroresUsuario;
        this.capacidadApren=capacidadApren;
        this.usabilidadCol=usabilidadCol;
        this.accesibilidad=accesibilidad;
        this.idUsa=idUsa;
        this.evaluacion=evaluacion;
        this.equipo_Calidad=equipo_calidad;
    }
}
