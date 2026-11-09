package br.gabi.loja;

import br.gabi.loja.exception.EstoqueInsuficienteException;
import br.gabi.loja.exception.PrecoInvalidoException;
import br.gabi.loja.exception.QuantidadeInvalidaException;
import br.gabi.loja.model.Produto;
import br.gabi.loja.repository.ProdutoRepository;
import br.gabi.loja.util.JPAUtil;
import jakarta.persistence.PersistenceException;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ProdutoRepository repository = new ProdutoRepository();

    public static void main(String[] args) {
        // Deixa o console limpo: só mostra avisos/erros do Hibernate
        Logger.getLogger("org.hibernate").setLevel(Level.WARNING);

        int opcao = -1;

        try {
            while (opcao != 0) {
                exibirMenu();

                try {
                    opcao = lerInteiro("Escolha uma opção: ");
                } catch (NumberFormatException e) {
                    System.out.println("\nErro: digite apenas números inteiros.");
                    opcao = -1;
                    continue;
                }

                System.out.println();

                switch (opcao) {
                    case 1 -> cadastrarProduto();
                    case 2 -> listarProdutos();
                    case 3 -> buscarProduto();
                    case 4 -> adicionarEstoque();
                    case 5 -> removerEstoque();
                    case 0 -> System.out.println("Encerrando o sistema...");
                    default -> System.out.println("Opção inválida.");
                }
            }
        } finally {
            JPAUtil.fechar();
            scanner.close();
        }
    }

    // ---------------------------------------------------------------
    // Menu
    // ---------------------------------------------------------------

    private static void exibirMenu() {
        System.out.println();
        System.out.println("=================================");
        System.out.println("      CONTROLE DE ESTOQUE");
        System.out.println("=================================");
        System.out.println();
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Buscar produto por ID");
        System.out.println("4 - Adicionar estoque");
        System.out.println("5 - Remover estoque");
        System.out.println("0 - Sair");
        System.out.println();
    }

    // ---------------------------------------------------------------
    // Opções do menu
    // ---------------------------------------------------------------

    private static void cadastrarProduto() {
        try {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            double preco = lerDecimal("Preço: ");
            int quantidade = lerInteiro("Quantidade: ");

            Produto produto = new Produto(nome, preco, quantidade);
            repository.salvar(produto);

            System.out.println();
            System.out.println("Produto cadastrado com sucesso!");
            System.out.println("ID: " + produto.getId());

        } catch (NumberFormatException e) {
            System.out.println("\nErro: valor numérico inválido.");
        } catch (PrecoInvalidoException | QuantidadeInvalidaException | IllegalArgumentException e) {
            System.out.println("\nErro: " + e.getMessage());
        } catch (PersistenceException e) {
            System.out.println("\nErro ao salvar o produto no banco de dados.");
        }
    }

    private static void listarProdutos() {
        try {
            List<Produto> produtos = repository.listarTodos();

            if (produtos.isEmpty()) {
                System.out.println("Nenhum produto cadastrado.");
                return;
            }

            for (Produto produto : produtos) {
                System.out.println(produto);
            }

        } catch (PersistenceException e) {
            System.out.println("Erro ao consultar o banco de dados.");
        }
    }

    private static void buscarProduto() {
        try {
            Long id = lerLong("ID do produto: ");
            Produto produto = repository.buscarPorId(id);

            System.out.println();
            if (produto == null) {
                System.out.println("Produto não encontrado.");
            } else {
                System.out.println(produto);
            }

        } catch (NumberFormatException e) {
            System.out.println("\nErro: ID inválido.");
        } catch (PersistenceException e) {
            System.out.println("\nErro ao consultar o banco de dados.");
        }
    }

    private static void adicionarEstoque() {
        try {
            Long id = lerLong("ID do produto: ");
            Produto produto = repository.buscarPorId(id);

            if (produto == null) {
                System.out.println("\nProduto não encontrado.");
                return;
            }

            int quantidade = lerInteiro("Quantidade para adicionar: ");

            produto.adicionarEstoque(quantidade);
            repository.atualizar(produto);

            System.out.println();
            System.out.println("Estoque atualizado com sucesso!");
            System.out.println("Quantidade atual: " + produto.getQuantidade());

        } catch (NumberFormatException e) {
            System.out.println("\nErro: valor numérico inválido.");
        } catch (QuantidadeInvalidaException e) {
            System.out.println("\nErro: " + e.getMessage());
        } catch (PersistenceException e) {
            System.out.println("\nErro ao atualizar o estoque no banco de dados.");
        }
    }

    private static void removerEstoque() {
        try {
            Long id = lerLong("ID do produto: ");
            Produto produto = repository.buscarPorId(id);

            if (produto == null) {
                System.out.println("\nProduto não encontrado.");
                return;
            }

            int quantidade = lerInteiro("Quantidade para remover: ");

            produto.removerEstoque(quantidade);
            repository.atualizar(produto);

            System.out.println();
            System.out.println("Estoque atualizado com sucesso!");
            System.out.println("Quantidade atual: " + produto.getQuantidade());

        } catch (NumberFormatException e) {
            System.out.println("\nErro: valor numérico inválido.");
        } catch (EstoqueInsuficienteException e) {
            System.out.println("\nErro: " + e.getMessage());
            System.out.println("Quantidade disponível: " + e.getQuantidadeDisponivel());
        } catch (QuantidadeInvalidaException e) {
            System.out.println("\nErro: " + e.getMessage());
        } catch (PersistenceException e) {
            System.out.println("\nErro ao atualizar o estoque no banco de dados.");
        }
    }

    // ---------------------------------------------------------------
    // Leitura segura de entradas numéricas (lança NumberFormatException
    // quando o usuário digita algo inválido; quem chama trata o erro)
    // ---------------------------------------------------------------

    private static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return Integer.parseInt(scanner.nextLine().trim());
    }

    private static long lerLong(String mensagem) {
        System.out.print(mensagem);
        return Long.parseLong(scanner.nextLine().trim());
    }

    private static double lerDecimal(String mensagem) {
        System.out.print(mensagem);
        // aceita vírgula ou ponto como separador decimal
        return Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
    }
}
