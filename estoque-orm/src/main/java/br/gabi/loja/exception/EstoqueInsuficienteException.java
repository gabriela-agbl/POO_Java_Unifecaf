package br.gabi.loja.exception;

/**
 * Lançada quando a quantidade solicitada para saída é superior
 * à quantidade disponível em estoque.
 */
public class EstoqueInsuficienteException extends RuntimeException {

    private final int quantidadeDisponivel;

    public EstoqueInsuficienteException(String mensagem, int quantidadeDisponivel) {
        super(mensagem);
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
}
