package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Marca implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 7796762247640143784L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int idMarca;
	@Column (length=30, nullable=false)
	private String nombre;
	public Marca(int idMarca, String nombre) {
		super();
		this.idMarca = idMarca;
		this.nombre = nombre;
	}
	public Marca() {
		super();
	
	}
	public int getIdMarca() {
		return idMarca;
	}
	public void setIdMArca(int idMarca) {
		this.idMarca = idMarca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
