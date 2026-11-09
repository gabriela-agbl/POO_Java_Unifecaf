package br.gabi.loja.model;

import br.gabi.loja.exception.EstoqueInsuficienteException;
import br.gabi.loja.exception.PrecoInvalidoException;
import br.gabi.loja.exception.QuantidadeInvalidaException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private double preco;

    private int quantidade;

    // A JPA exige um construtor sem argumentos (público ou protegido)
    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do produto não pode ser vazio.");
        }
        validarPreco(preco);
        if (quantidade < 0) {
            throw new QuantidadeInvalidaException("O estoque inicial não pode ser negativo.");
        }

        this.nome = nome.trim();
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // ---------- Regras de negócio ----------

    public void adicionarEstoque(int quantidade) {
        validarQuantidade(quantidade);
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        validarQuantidade(quantidade);
        if (quantidade > this.quantidade) {
            throw new EstoqueInsuficienteException(
                    "Estoque insuficiente.", this.quantidade);
        }
        this.quantidade -= quantidade;
    }

    public void setPreco(double preco) {
        validarPreco(preco);
        this.preco = preco;
    }

    // ---------- Validações (encapsuladas) ----------

    private static void validarPreco(double preco) {
        if (!Double.isFinite(preco) || preco <= 0) {
            throw new PrecoInvalidoException("O preço deve ser maior que zero.");
        }
    }

    private static void validarQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaException("A quantidade deve ser maior que zero.");
        }
    }

    // ---------- Getters ----------

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | %s | R$ %.2f | Estoque: %d",
                id, nome, preco, quantidade);
    }
}
