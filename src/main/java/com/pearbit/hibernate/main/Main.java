package com.pearbit.hibernate.main;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import com.pearbit.hibernate.controller.AutorController;
import com.pearbit.hibernate.model.daoImpl.AutorDAOImpl;
import com.pearbit.hibernate.model.entity.Autor;

public class Main {

	
	
	public static void main(String[] args) {
		AutorController autorController = new AutorController() ;
		List<Autor> autores = Arrays.asList(
				new Autor("Jouse", "Garcia", LocalDate.of(1995,04, 8)),
				new Autor("Alan", "Martinez",LocalDate.of(1986,12, 7)),
				new Autor("Jose Antonio", "Meade", LocalDate.of(1977,01, 2))
				);
		
		for(Autor autor: autores) {
			autorController.saveAutor(autor);
			
		}
		
		List<Autor> listaAutores = autorController.findAllAutores();
		
		for(Autor autor: listaAutores) {
			System.out.println(autor.toString());
		}
		
	}

}
