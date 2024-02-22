package br.com.henriquefonseca.projeto_de_gestao_vagas.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {
    private String message;
    private String field;
}
