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
@Table(name = "requerimientos_de_auditoria")
public class RequerimientoAu {
    @Column
    private int registro_eventos;
    private int cant_atenciones;
    private int actualizacion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_ra;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")
    private Evaluacion evaluacion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")
    private EquipoCalidad equipo_Calidad;

    public RequerimientoAu(){}

    public RequerimientoAu(int registro_eventos, int cant_atenciones, int actualizacion, Long id_ra,
                            Evaluacion evaluacion, EquipoCalidad equipo_calidad){

        this.registro_eventos=registro_eventos;
        this.cant_atenciones=cant_atenciones;
        this.actualizacion=actualizacion;
        this.id_ra=id_ra;
        this.evaluacion=evaluacion;
        this.equipo_Calidad=equipo_calidad;
    }
}
