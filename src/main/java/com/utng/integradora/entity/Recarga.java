package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Recarga implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 944150317861227791L;

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int idRecarga;
	@Column (name="telefono", nullable=false)
	private int telefono;
	@Column (length=100, nullable=false)
	private String compania;
	@Column (length=100, nullable=false)
	private String tipo;
	@Column (length=11, nullable=false)
	private int monto;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	public Recarga(int idRecarga, int telefono, String compania, String tipo, int monto) {
		super();
		this.idRecarga = idRecarga;
		this.telefono = telefono;
		this.compania = compania;
		this.tipo = tipo;
		this.monto = monto;
	}
	public Recarga() {
		super();
		
	}
	public int getIdRecarga() {
		return idRecarga;
	}
	public void setIdRecarga(int idRecarga) {
		this.idRecarga = idRecarga;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
}
