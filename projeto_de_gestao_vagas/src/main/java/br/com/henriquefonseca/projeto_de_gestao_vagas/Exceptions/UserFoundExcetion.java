package br.com.henriquefonseca.projeto_de_gestao_vagas.Exceptions;

public class UserFoundExcetion extends RuntimeException {
    public UserFoundExcetion() {
       super("Usuario já existe");
    }
}
