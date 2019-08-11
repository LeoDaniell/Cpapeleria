package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Venta implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4942322073097021496L;

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int idVenta;
	private int cantidad;
	public Venta(int idVenta, int cantidad) {
		super();
		this.idVenta = idVenta;
		this.cantidad = cantidad;
	}
	public Venta() {
		super();
		
	}
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
