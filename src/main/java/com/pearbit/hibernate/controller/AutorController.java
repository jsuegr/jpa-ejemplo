package com.pearbit.hibernate.controller;

import java.util.List;

import com.pearbit.hibernate.model.dao.AutorDAO;
import com.pearbit.hibernate.model.daoImpl.AutorDAOImpl;
import com.pearbit.hibernate.model.entity.Autor;

public class AutorController {
	public AutorDAOImpl autorDao = new AutorDAOImpl();
	
	//traer un autor
	public Autor getAutor(long idAutor) {
		
		return autorDao.getAutor(idAutor);
	}
	
	//traer todos los autores
	public List<Autor> findAllAutores(){
	
		return autorDao.findAllAutores();
	}
	
	//buscar un autor por nombre
	public List<Autor> findAutorByName(String nombreAutor){
		
		return autorDao.findAutorByName(nombreAutor);
	}
	
	//crea un autor
	public void saveAutor(Autor autor) {
		
		try {
			autorDao.saveAutor(autor);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	//actualizar un autor
	public void updateAutor(Autor autor) {
	
		autorDao.updateAutor(autor);
	}
	
	//eliminar un autor
	public void removeAutor(Autor autor) {
		
		autorDao.removeAutor(autor);
	}
}
