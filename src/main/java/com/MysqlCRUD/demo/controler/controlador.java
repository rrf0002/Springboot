package com.MysqlCRUD.demo.controler;

import com.MysqlCRUD.demo.interfaceService.IPersonaService;
import com.MysqlCRUD.demo.modelo.Persona;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class controlador {
    @Autowired
    private IPersonaService service;
    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas=service.listar();
        model.addAttribute("personas", personas);
        return"index";
    }
    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new Persona());
        return"form";
    }
    
    @PostMapping("/save")
    public String save(@Valid Persona p,Model model){
        service.save(p);
        return"redirect:/listar";
    }
}
