package com.example.cens.models;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "equipo_calidad")
public class EquipoCalidad {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipoCalidad;
	@Column(length = 50, name="nombre")
    private String nameLogin;
    @Column(length = 50, name="email")
    private String Email;
    @Column(length = 50, name="contraseña")
    private String Contraseña;
    @Column(length = 50, name="rut")
    private String rut;
    @OneToMany(mappedBy = "equipo_calidad", cascade = CascadeType.ALL)
    private List<CalidadServicio> cali;

    @OneToMany(mappedBy = "equipo_Calidad", cascade = CascadeType.ALL)
    private List<Compatibilidad> compatibility;

    @OneToMany(mappedBy = "equipo_Calidad", cascade = CascadeType.ALL)
    private List<Fiabilidad> fiability;

    @OneToMany(mappedBy = "equipo_Calidad", cascade = CascadeType.ALL)
    private List<Proceso> proces;

    @OneToMany(mappedBy = "equipo_Calidad", cascade = CascadeType.ALL)
    private List<ProcesoClinic> procesosClinico;

    @OneToMany(mappedBy = "equipo_Calidad", cascade = CascadeType.ALL)
    private List<RequerimientoAu> reqAu;

    @OneToMany(mappedBy = "equipo_Calidad", cascade = CascadeType.ALL)
    private List<RequerimientoTec> reqTec;

    @OneToMany(mappedBy = "equipo_Calidad", cascade = CascadeType.ALL)
    private List<SeguridadControl> seguCon;

    @OneToMany(mappedBy = "equipo_Calidad", cascade = CascadeType.ALL)
    private List<Seguridad> seg;

    @OneToMany(mappedBy = "equipo_Calidad", cascade = CascadeType.ALL)
    private List<Usabilidad> usa;

    @OneToMany(mappedBy = "equipo_Calidad", cascade = CascadeType.ALL)
    private List<UsabilidadAccesibilidad> usabilidad; 

	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "rutEmpresa")
	  private Institucion instutucion;


  public EquipoCalidad() {

  }
  public EquipoCalidad(String nameLogin, String Email, String Contraseña, String rut){
      this.nameLogin=nameLogin;
      this.Email=Email;
      this.Contraseña=Contraseña;
      this.rut=rut;
  }
}
