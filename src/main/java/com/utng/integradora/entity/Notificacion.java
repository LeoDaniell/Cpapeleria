package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Notificacion implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -8611748813470173109L;

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int idNotificacion;
	@Column (name="fechaNotificacion")
	@Temporal (TemporalType.DATE)
	private String fechaNotificacion;
	@Column (length=20, nullable=false)
	private String estado;
	public Notificacion(int idNotificacion, String fechaNotificacion, String estado) {
		super();
		this.idNotificacion = idNotificacion;
		this.fechaNotificacion = fechaNotificacion;
		this.estado = estado;
	}
	public Notificacion() {
		super();
		
	}
	public int getIdNotificacion() {
		return idNotificacion;
	}
	public void setIdNotificacion(int idNotificacion) {
		this.idNotificacion = idNotificacion;
	}
	public String getFechaNotificacion() {
		return fechaNotificacion;
	}
	public void setFechaNotificacion(String fechaNotificacion) {
		this.fechaNotificacion = fechaNotificacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
