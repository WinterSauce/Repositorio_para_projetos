package br.com.henriquefonseca.gestaodevagas.module.company.Controllers;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Object> create(@RequestBody AuthCompanyDTO autoCompanyDTO)  {
        try{
           var result = this.authCompanyUseCase.execute(autoCompanyDTO);
           return ResponseEntity.ok().body(result);
    }catch(Exception e){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
    }
        

    }
    
}
