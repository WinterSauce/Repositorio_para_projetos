package br.com.henriquefonseca.projeto_de_gestao_vagas.Modules.Candidato;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "candidato")
public class CandidatoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome")
    private String nome;
    
    @NotBlank()
    @Pattern (regexp= "\\S+", message = "O campo não deve conter espaço")
    private String username;
    
    @Email(message = "O campo deve conter um Email válido")
    private String email;
    
    @Length (min=10, max=100, message = "Essa senha deve ter entre 10 a 100 caracteres")
    private String senha;
    private String descricao;
    private String curriculo;

    @CreationTimestamp
    private LocalDateTime createAt;
    
}
