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

@Entity
@Data
@Table(name = "seguridad_y_control")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idSeguridad")
public class SeguridadControl {
    
    @Column
    private int Matriz_de_roles;
    private int control_accesos;
    private int ident_usuario;
    private int autenticación;
    private int autenticación_visual;
    private int identifiador_sesion;
    private int identidades;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSeguridad;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")      
    private Evaluacion evaluacion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")
    private EquipoCalidad equipo_Calidad;

    public SeguridadControl(){}

    public SeguridadControl(int Matriz_de_roles, int control_accesos, int ident_usuario, int autenticación, int autenticación_visual,
                    int identifiador_sesion, int identidades, Long idSeguridad, EquipoCalidad equipo_calidad){
        this.Matriz_de_roles=Matriz_de_roles;
        this.control_accesos=control_accesos;
        this.ident_usuario=ident_usuario;
        this.autenticación=autenticación;
        this.autenticación_visual=autenticación_visual;
        this.identifiador_sesion=identifiador_sesion;
        this.identidades=identidades;
        this.idSeguridad=idSeguridad;
        this.equipo_Calidad=equipo_calidad;
    }

}
