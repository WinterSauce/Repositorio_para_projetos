package br.com.henriquefonseca.gestao_de_vagas.modules.candidate.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.henriquefonseca.gestao_de_vagas.modules.candidate.CandideEntity;


@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/" )
    public void create(@RequestBody CandideEntity candideEntity){

        System.out.println("Candidato");
        System.out.println(candideEntity.getEmail());
    }
    
}
