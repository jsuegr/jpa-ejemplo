package com.pearbit.hibernate.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Autor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_autor")
	private long idAutor;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private LocalDate fechaNacimiento;
	
	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Autor(String nombre, String apellidos, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}
	public long getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(long idAutor) {
		this.idAutor = idAutor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
}
