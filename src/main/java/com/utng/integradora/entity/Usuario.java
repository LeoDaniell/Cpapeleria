package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Usuario implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 383443337909960929L;

	
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int idUsuario;
	@Column(length=20, nullable=false)
	private String username;
	@Column(length=20, nullable=false)
	private String contrasena;
	@Column(length=50, nullable=false)
	private String correo;
	@Column(length=50, nullable=false)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="idTipoUsuario")
	private Tipousuario tipousuario;
	public Usuario(int idUsuario, String username, String contrasena, String correo, String nombre) {
		super();
		this.idUsuario = idUsuario;
		this.username = username;
		this.contrasena = contrasena;
		this.correo = correo;
		this.nombre = nombre;
	}
	public Usuario() {
		super();
		
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
