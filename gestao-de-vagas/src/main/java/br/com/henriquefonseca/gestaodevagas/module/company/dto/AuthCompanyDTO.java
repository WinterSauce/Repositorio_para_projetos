package br.com.henriquefonseca.gestaodevagas.module.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthCompanyDTO {

    private String password;
    private String username;
    public String execute(AuthCompanyDTO autoCompanyDTO) {
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

    
}
