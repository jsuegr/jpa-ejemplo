package com.pearbit.hibernate.model.dao;

import java.util.List;

import com.pearbit.hibernate.model.entity.Autor;

public interface AutorDAO {

	//traer un autor
	public Autor getAutor(long idAutor);
	
	//traer todos los autores
	public List<Autor> findAllAutores();
	
	//buscar un autor por nombre
	public List<Autor> findAutorByName(String nombreAutor);
	
	//crea un autor
	public void saveAutor(Autor autor);
	
	//actualizar un autor
	public void updateAutor(Autor autor);
	
	//eliminar un autor
	public void removeAutor(Autor autor);
}
