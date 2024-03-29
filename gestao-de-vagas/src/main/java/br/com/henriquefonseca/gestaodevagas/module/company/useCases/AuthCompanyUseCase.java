package br.com.henriquefonseca.gestaodevagas.module.company.useCases;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import br.com.henriquefonseca.gestaodevagas.module.company.dto.AuthCompanyDTO;
import br.com.henriquefonseca.gestaodevagas.module.company.repositories.CompanyRepository;

@Service
public class AuthCompanyUseCase {

    @Value("${security.token.secret}")
    private String secreKey;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private PasswordEncoder passowordEncoder;

    public String execute(AuthCompanyDTO authCompanyDTO) throws AuthenticationException {
        var company = this.companyRepository.findByUsername(authCompanyDTO.getUsername()).orElseThrow(
        () -> {
            throw new UsernameNotFoundException("Company not found");
        });

        var passwordMatches = this.passowordEncoder.matches(authCompanyDTO.getPassword(), company.getPassword());

        if(!passwordMatches){
            throw new AuthenticationException();
        }
        Algorithm algorithm = Algorithm.HMAC256(secreKey);
        var token = JWT.create(). withIssuer("javagas")
        .withExpiresAt(Instant.now().plus(Duration.ofHours(2)))

        .withSubject(company.getId().toString())
        .sign(algorithm);

        return token;
        
        

    }
    
}
