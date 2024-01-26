package br.com.henriquefonseca.gestaodevagas.module.company.Controllers;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.henriquefonseca.gestaodevagas.module.company.dto.AuthCompanyDTO;
import br.com.henriquefonseca.gestaodevagas.module.company.useCases.AuthCompanyUseCase;

@RestController
@RequestMapping("/auth")
public class AuthCompanyController {

    @Autowired
    private AuthCompanyUseCase authCompanyUseCase;

    @PostMapping("/company")
    public String create(@RequestBody AuthCompanyDTO autoCompanyDTO) throws AuthenticationException {
        return this.authCompanyUseCase.execute(autoCompanyDTO);

    }
    
}
