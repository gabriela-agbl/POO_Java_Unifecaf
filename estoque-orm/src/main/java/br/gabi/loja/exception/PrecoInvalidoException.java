package br.gabi.loja.exception;

/**
 * Lançada quando um produto recebe um preço inválido
 * (negativo, zero, NaN ou infinito).
 */
public class PrecoInvalidoException extends RuntimeException {

    public PrecoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
