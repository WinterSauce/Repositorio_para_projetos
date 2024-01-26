package br.com.henriquefonseca.gestaodevagas.module.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.henriquefonseca.gestaodevagas.module.company.entities.JobEntity;
import br.com.henriquefonseca.gestaodevagas.module.company.repositories.JobRepository;

@Service
public class CreateJobUseCase {
    
    @Autowired
    private JobRepository jobRepository;
    
    public JobEntity execute(JobEntity jobEntity){
        return this.jobRepository.save(jobEntity);
        
    }
    
}
