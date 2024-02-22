package br.com.henriquefonseca.projeto_de_gestao_vagas.Modules.Candidato.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.henriquefonseca.projeto_de_gestao_vagas.Modules.Candidato.CandidatoEntity;
import br.com.henriquefonseca.projeto_de_gestao_vagas.Modules.Candidato.Controladores.Casos_de_Uso.Casos_de_Uso_Candidato;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Candidato")
public class CandidatoController {

    @Autowired
    private Casos_de_Uso_Candidato casos_de_Uso_Candidato;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody CandidatoEntity candidatoEntity){
       try{
        var result = this.casos_de_Uso_Candidato.execute(candidatoEntity);
        return ResponseEntity.ok().body(result);
       }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
       }
       
       
        
    }

}
