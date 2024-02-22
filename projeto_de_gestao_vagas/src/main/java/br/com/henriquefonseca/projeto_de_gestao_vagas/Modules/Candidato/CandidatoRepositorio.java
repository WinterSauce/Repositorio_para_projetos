package br.com.henriquefonseca.projeto_de_gestao_vagas.Modules.Candidato;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepositorio extends JpaRepository<CandidatoEntity, UUID> {
    Optional <CandidatoEntity> findByUsernameOrEmail(String username, String email);
}
