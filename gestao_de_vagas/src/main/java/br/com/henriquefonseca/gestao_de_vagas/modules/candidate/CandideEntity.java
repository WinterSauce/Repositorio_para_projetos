package br.com.henriquefonseca.gestao_de_vagas.modules.candidate;

import java.util.UUID;

import lombok.Data;

@Data
public class CandideEntity {

    private UUID id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculum;

    
}