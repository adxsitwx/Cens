package com.example.cens.models;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Data
@Entity
@Table(name = "instutución")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_empresa")
public class Institucion {

    @Column(length = 50, name = "NombreEmpresa")
    private String name_Empresa;

    @Column(length = 50, name = "Email")
    private String email;

    @Column(length = 50, name = "Etapa")
    private String etapa;

    @Column(length = 50, name = "nombre")
    private String nombre;

    @Column(length = 50, name = "rut")
    private String rut;

    @Column(length = 50, name = "apellido")
    private String apellido;

    @Column(length = 50, name = "telefono")
    private int telefono;

    @Column(length = 50, name = "fechaInicio")
    private String fechaInicio;
    
    @Column(length = 50, name = "razon")
    private String razonSocial;

    @Column(length = 50, name = "rutEmpresa")
    private String rutEmpresa;

    @Column(name = "empresaEvaluada")
    private Boolean empresaEvaluada;

    @Temporal(TemporalType.DATE)
    private Date fechaNDA;
    private Date fechaCreacionForm;
    private Date envioForm;
    private Date fechaDemos;
    private Date fechaAccesoHerr;
    private Date fechaEntregaInform;
    private Date fechaInfEvaluadores;
    private Date fechaEviFonasa;
    private Date fechaEviFinal;
    private Date fechaIntFonasa;
    private Date fechaOtorga;
    private Date fechaEviSello;
    private Date diasInforme;

    @Id
    @Column(length = 45, name = "id_empresa")
    private int id_empresa;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario")
    private EquipoCalidad equipo_calidad;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idevaluacion")
    private Evaluacion evaluacion;

    public Institucion(){}

    public Institucion(String name_Empresa, String email, String etapa, String nombre, String apellido, String rut,
                    int telefono, String fechaInicio, String razonSocial, String rutEmpresa, Boolean empresaEvaluada, Date fechaNDA,
                    Date fechaCreacionForm, Date envioForm, Date fechaDemos, Date fechaAccesoHerr, Date fechaEntregaInform,
                    Date fechaInfEvaluadores, Date fechaEviFonasa, Date fechaEviFinal, Date fechaIntFonasa, Date fechaOtorga,
                    Date fechaEviSello, Date diasInforme, int id_empresa){
                
                this.name_Empresa = name_Empresa;
                this.email=email;
                this.etapa=etapa;
                this.nombre=nombre;
                this.apellido=apellido;
                this.rut=rut;
                this.telefono=telefono;
                this.fechaInicio=fechaInicio;
                this.razonSocial=razonSocial;
                this.rutEmpresa=rutEmpresa;
                this.empresaEvaluada=empresaEvaluada;
                this.fechaNDA=fechaNDA;
                this.fechaCreacionForm=fechaCreacionForm;
                this.envioForm=envioForm;
                this.fechaDemos=fechaDemos;
                this.fechaAccesoHerr=fechaAccesoHerr;
                this.fechaEntregaInform=fechaEntregaInform;
                this.fechaInfEvaluadores=fechaInfEvaluadores;
                this.fechaEviFonasa=fechaEviFonasa;
                this.fechaEviFinal=fechaEviFinal;
                this.fechaIntFonasa=fechaIntFonasa;
                this.fechaOtorga=fechaOtorga;
                this.fechaEviSello=fechaEviSello;
                this.diasInforme=diasInforme;
                this.id_empresa=id_empresa;
    }
}
