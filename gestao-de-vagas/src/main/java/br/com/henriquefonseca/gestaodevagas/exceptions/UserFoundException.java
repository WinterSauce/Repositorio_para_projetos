package br.com.henriquefonseca.gestaodevagas.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
        super("Usuário já existe");
    }
    
}
