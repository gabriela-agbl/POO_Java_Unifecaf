package br.gabi.loja.repository;

import br.gabi.loja.model.Produto;
import br.gabi.loja.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class ProdutoRepository {
	public void salvar(Produto produto) {
		EntityManager em = JPAUtil.getFactory().createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			em.persist(produto);
			
			em.getTransaction().commit();
		}catch(RuntimeException e) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().getRollbackOnly();
			}
			
			throw e;
		}finally {
			em.close();
		}
	}
	
	public Produto buscar(Long id) {
		EntityManager em = JPAUtil.getFactory().createEntityManager();
		
		try {
			return em.find(Produto.class, id);
		}finally {
			em.close();
		}
	}
}
