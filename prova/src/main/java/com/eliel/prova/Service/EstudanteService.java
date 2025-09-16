package com.eliel.prova.Service;

import com.eliel.prova.Entity.Estudante;
import com.eliel.prova.Repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public List<Estudante> findAll(){
        return this.estudanteRepository.findAll();
    }

    public Estudante findById(Long id){
        return this.estudanteRepository.findById(id).orElse(null);
    }

    public Estudante salvarEstudante(Estudante estudante){
        return this.estudanteRepository.save(estudante);
    }

    public void deletarAlunos(Long id){
        this.estudanteRepository.deleteById(id);
    }

}
