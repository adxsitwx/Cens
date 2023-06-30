package com.example.cens.models;
import java.util.Date;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "institución en proceso de mejora")
public class InstitucionTra implements Serializable{

    private static final long serialVersionUID = 1L;
	private Date fechEntrega;
    private Date ultimaEvi;
    private Date correoEstado;
    private String comentarios;
    private int porcenSello;
    private int cumpliSello;
    private int integracion;
    private int cantObs;
    private int obsDi;
    private int totalEva;
    private int obsATF;
    private int totalATF;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTra;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "Email")      
    private Institucion instutucion;

    public InstitucionTra(){}
    
    public InstitucionTra(Date fechEntrega, Date ultimaEvi, Date correoEstado, String comentarios, int porcenSello,
                        int cumpliSello, int integracion, int cantObs, int obsDi, int totalEva, int obsATF, int totalATF,
                        Long idTra, Institucion instutucion){
        this.fechEntrega=fechEntrega;
        this.ultimaEvi=ultimaEvi;
        this.correoEstado=correoEstado;
        this.comentarios=comentarios;
        this.porcenSello=porcenSello;
        this.cumpliSello=cumpliSello;
        this.integracion=integracion;
        this.cantObs=cantObs;
        this.obsDi=obsDi;
        this.totalEva=totalEva;
        this.obsATF=obsATF;
        this.totalATF=totalATF;
        this.idTra=idTra;
        this.instutucion=instutucion;
   }
}
