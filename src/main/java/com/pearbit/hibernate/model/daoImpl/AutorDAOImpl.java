package com.pearbit.hibernate.model.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pearbit.hibernate.model.dao.AutorDAO;
import com.pearbit.hibernate.model.entity.Autor;

public class AutorDAOImpl implements AutorDAO{

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
	
	@Override
	public Autor getAutor(long idAutor) {
		EntityManager em = emf.createEntityManager();
		return (Autor) em.getReference(Autor.class, idAutor);
	}

	@Override
	public List<Autor> findAllAutores() {
		EntityManager em = emf.createEntityManager();
		return (List<Autor>) em.createQuery("FROM Autor a").getResultList();
	}

	@Override
	public List<Autor> findAutorByName(String nombreAutor) {
		EntityManager em = emf.createEntityManager();
		List<Autor> listaAutor = (List<Autor>) em.createQuery("FROM Autor a WHERE a.nombre =" + nombreAutor).getResultList();
		em.close();
		return listaAutor;
	}

	@Override
	public void saveAutor(Autor autor) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(autor);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void updateAutor(Autor autor) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(autor);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void removeAutor(Autor autor) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(autor);
		em.getTransaction().commit();
		em.close();
	}

}
