package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tipousuario")
public class Tipousuario implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 3770430468333436074L;

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int idTipoUsuario;
	@Column (length=30, nullable=false)
	private String nombre;
	
	public Tipousuario(int idTipoUsuario, String nombre) {
		super();
		this.idTipoUsuario = idTipoUsuario;
		this.nombre = nombre;
	}
	public Tipousuario() {
		
		
	}
	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
