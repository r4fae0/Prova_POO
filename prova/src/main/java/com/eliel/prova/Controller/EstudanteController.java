package com.eliel.prova.Controller;

import com.eliel.prova.Entity.Estudante;
import com.eliel.prova.Service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/estudantes")
@RestController
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @GetMapping
    public List<Estudante> findAll(){
        return this.estudanteService.findAll();
    }
    @GetMapping("/{id}")
    public Estudante findById(@PathVariable Long id){
        return estudanteService.findById(id);
    }

    @PostMapping
    public Estudante salvarEstudante(@RequestBody Estudante estudante){
        return this.estudanteService.salvarEstudante(estudante);
    }

    @DeleteMapping("/{id}")
    public void deletarAlunos(@PathVariable Long id){
        this.estudanteService.deletarAlunos(id);
    }

}
