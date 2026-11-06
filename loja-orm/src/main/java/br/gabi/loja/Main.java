package br.gabi.loja;

import br.gabi.loja.model.Produto;
import br.gabi.loja.repository.ProdutoRepository;
import br.gabi.loja.util.JPAUtil;

public class Main {

	public static void main(String[] args) {
		try {
			ProdutoRepository repository = new ProdutoRepository();
			
			Produto produto = new Produto("Teclado", 150.00);
			
			repository.salvar(produto);
			
			Produto encontrado = repository.buscar(produto.getId());
			
			if(encontrado != null) {
				System.out.println("Produto: " +encontrado.getNome());
			}
		}finally {
			JPAUtil.fechar();
		}

	}

}
