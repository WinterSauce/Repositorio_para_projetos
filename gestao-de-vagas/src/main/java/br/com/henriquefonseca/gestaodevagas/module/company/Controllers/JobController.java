package br.com.henriquefonseca.gestaodevagas.module.company.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.henriquefonseca.gestaodevagas.module.company.entities.JobEntity;
import br.com.henriquefonseca.gestaodevagas.module.company.useCases.CreateJobUseCase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private CreateJobUseCase createJobUseCase;
    @PostMapping("/")
    public JobEntity create(@Valid @RequestBody JobEntity jobEntity){
        return createJobUseCase.execute(jobEntity);
    }
    
}
