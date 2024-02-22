package br.com.henriquefonseca.projeto_de_gestao_vagas.Modules.Companhia.Entidades;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity(name = "job")
@Data
public class JobEntidade {
    
    private UUID id;
    private String descricao;
    private String beneficios;
    private String nivel;

    @ManyToOne()
    @JoinColumn(name = "companhia_id")
    private CompanhiaEntidade companhiaEntidade;

    @Column(name = "companhia_id")
    private UUID companhiaId;

    @CreationTimestamp
    private LocalDateTime createAt;

}
