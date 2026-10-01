package br.com.livraria.exception;

public class LivroNaoEncontradoException extends RuntimeException {
    public LivroNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
