package com.example.cens.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "evaluacion")
public class Evaluacion {
	@Id
    @Column(name = "idevaluacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idevaluacion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_empresa")
    private Institucion instutucion;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUsa")
    private Usabilidad usability;
    

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_procesoClinic")
    private ProcesoClinic formproce;

    public Evaluacion(){}

    public Evaluacion(Long idevaluacion, Institucion instutucion, ProcesoClinic formproce){
        this.idevaluacion=idevaluacion;
        this.instutucion=instutucion;
        this.formproce=formproce;
    }
}
