package com.example.cens.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "calidad_servicio")
public class CalidadServicio {
	@Column
    private int config;
    private int casos;
    private int datos;
    private int flujos;

    @Id
    @Column
    private Long idCs;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")
    private Evaluacion evaluacion;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")
    private EquipoCalidad equipo_calidad;

    public CalidadServicio(){}

    public CalidadServicio(int config, int casos, int datos, int flujos, Long idCs, Evaluacion evaluacion,
                            EquipoCalidad equipo_calidad){
        
        this.config=config;
        this.casos=casos;
        this.datos=datos;
        this.flujos=flujos;
        this.idCs=idCs;
        this.evaluacion=evaluacion;
        this.equipo_calidad=equipo_calidad;
    }

}
