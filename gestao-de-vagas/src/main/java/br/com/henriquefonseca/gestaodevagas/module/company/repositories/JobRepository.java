package br.com.henriquefonseca.gestaodevagas.module.company.repositories;

import java.util.UUID;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.henriquefonseca.gestaodevagas.module.company.entities.JobEntity;
import br.com.henriquefonseca.gestaodevagas.module.company.repositories.JobRepository;

public interface JobRepository extends JpaRepository<JobEntity, UUID>{

    
}
