package br.gabi.loja.repository;

import br.gabi.loja.model.Produto;
import br.gabi.loja.util.JPAUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ProdutoRepository {

    public void salvar(Produto produto) {
        EntityManager em = JPAUtil.getFactory().createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();

        } catch (RuntimeException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;

        } finally {
            em.close();
        }
    }

    public Produto buscarPorId(Long id) {
        EntityManager em = JPAUtil.getFactory().createEntityManager();

        try {
            return em.find(Produto.class, id);
        } finally {
            em.close();
        }
    }

    public List<Produto> listarTodos() {
        EntityManager em = JPAUtil.getFactory().createEntityManager();

        try {
            return em.createQuery("SELECT p FROM Produto p ORDER BY p.id", Produto.class)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public void atualizar(Produto produto) {
        EntityManager em = JPAUtil.getFactory().createEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(produto);
            em.getTransaction().commit();

        } catch (RuntimeException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;

        } finally {
            em.close();
        }
    }
}
