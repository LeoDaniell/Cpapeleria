package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TipoNotificacion implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 2497331297301748874L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int idTipoNotificacion;
	@Column (length=30, nullable=false)
	private String nombre;
	public TipoNotificacion(int idTipoNotificacion, String nombre) {
		super();
		this.idTipoNotificacion = idTipoNotificacion;
		this.nombre = nombre;
	}
	public TipoNotificacion() {
		super();
		
	}
	public int getIdTipoNotificacion() {
		return idTipoNotificacion;
	}
	public void setIdTipoNotificacion(int idTipoNotificacion) {
		this.idTipoNotificacion = idTipoNotificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
