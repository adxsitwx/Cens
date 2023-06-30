package com.example.cens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.cens.models.EquipoCalidad;
import com.example.cens.models.Institucion;
import com.example.cens.repositories.EquipoCalidadRepository;
import com.example.cens.repositories.InstitucionRepository;

@Controller
public class CensController {
	
    @Autowired
    private InstitucionRepository institutucionCrud;
    @GetMapping("/signin")
    public String singIn(Model model) {
    	
    	model.addAttribute("institucion", new Institucion());
        return "signin.html";
    }
    @PostMapping("/signin")
    public String singInInstitucion(@ModelAttribute("institucion") Institucion institucion) {
    	institutucionCrud.save(institucion);
        return "signin.html";
    }
    /*
    @GetMapping("/crear")
    public String crearEmpresaPage(Model model) {
    	Institucion institucion = new Institucion();
    	model.addAttribute("institucion", institucion);
        return "Empresas.html";
    }
    /*
    @PostMapping("/crear")
    public String crearEmpresa(@ModelAttribute("institucion") Institucion institucion){
		return "Empresas.html";
        
    }
    @GetMapping("/trazabilidad")
    public String trazabilidad() {

        return "Trazabilidad.html";
    }

    // @GetMapping("/buscar")
    // public ResponseEntity<List<modelocens>> findAll(){
    //     List<modelocens> Empresas = empresa.buscarTodos();
    //     model.addAttribute("buscar",Empresas);
    //     return "buscar";
    // }

    */



}
