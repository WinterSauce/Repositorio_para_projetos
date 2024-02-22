package br.com.henriquefonseca.projeto_de_gestao_vagas.Modules.Candidato.Controladores.Casos_de_Uso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.henriquefonseca.projeto_de_gestao_vagas.Exceptions.UserFoundExcetion;
import br.com.henriquefonseca.projeto_de_gestao_vagas.Modules.Candidato.CandidatoEntity;
import br.com.henriquefonseca.projeto_de_gestao_vagas.Modules.Candidato.CandidatoRepositorio;

@Service
public class Casos_de_Uso_Candidato {
@Autowired
    private CandidatoRepositorio candidatoRepositorio;

    public CandidatoEntity execute(CandidatoEntity candidatoEntity){
        this.candidatoRepositorio.findByUsernameOrEmail(candidatoEntity.getUsername(), candidatoEntity.getEmail())
        .ifPresent((user) ->{
            throw new UserFoundExcetion();

        });
    return this.candidatoRepositorio.save(candidatoEntity);
    }
    
}

