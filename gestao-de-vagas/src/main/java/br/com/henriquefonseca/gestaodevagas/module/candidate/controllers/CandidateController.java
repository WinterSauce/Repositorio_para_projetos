package br.com.henriquefonseca.gestaodevagas.module.candidate.controllers;
import org.springframework.web.bind.annotation.RestController;
import br.com.henriquefonseca.gestaodevagas.module.candidate.CandidateEntity;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@Valid @RequestBody CandidateEntity candidateEntity){
        System.out.println("Candidato ");
        System.out.println(candidateEntity.getEmail());
        
    }


    
}
