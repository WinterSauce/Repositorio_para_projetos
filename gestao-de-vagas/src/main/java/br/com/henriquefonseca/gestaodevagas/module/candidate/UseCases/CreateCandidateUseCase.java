package br.com.henriquefonseca.gestaodevagas.module.candidate.UseCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.henriquefonseca.gestaodevagas.exceptions.UserFoundException;
import br.com.henriquefonseca.gestaodevagas.module.candidate.CandidateEntity;
import br.com.henriquefonseca.gestaodevagas.module.candidate.CandidateRepository;
import br.com.henriquefonseca.gestaodevagas.module.company.entities.CompanyEntity;

@Service
public class CreateCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;
    

    public CandidateEntity execute(CandidateEntity candidateEntity){
        
        this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
        .ifPresent((user) -> {
            throw new UserFoundException();
        });

        return this.candidateRepository.save(candidateEntity);

    }


	public CompanyEntity execute(CompanyEntity companyEntity) {
		throw new UnsupportedOperationException("Unimplemented method 'execute'");
	}
}
