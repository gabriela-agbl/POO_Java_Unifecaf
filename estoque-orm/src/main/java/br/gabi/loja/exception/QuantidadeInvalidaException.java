package br.gabi.loja.exception;

/**
 * Lançada quando uma operação tenta adicionar ou remover uma quantidade
 * menor ou igual a zero, ou quando o estoque inicial é negativo.
 */
public class QuantidadeInvalidaException extends RuntimeException {

    public QuantidadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
