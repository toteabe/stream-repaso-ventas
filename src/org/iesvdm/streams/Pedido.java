package org.iesvdm.streams;
// Generated 15 dic. 2022 23:59:33 by Hibernate Tools 5.6.9.Final

import java.util.Date;

/**
 * Pedido generated by hbm2java
 */
public class Pedido implements java.io.Serializable {

	private Integer id;
	private Cliente cliente;
	private Comercial comercial;
	private double total;
	private Date fecha;

	public Pedido() {
	}

	public Pedido(Cliente cliente, Comercial comercial, double total) {
		this.cliente = cliente;
		this.comercial = comercial;
		this.total = total;
	}

	public Pedido(Cliente cliente, Comercial comercial, double total, Date fecha) {
		this.cliente = cliente;
		this.comercial = comercial;
		this.total = total;
		this.fecha = fecha;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Comercial getComercial() {
		return this.comercial;
	}

	public void setComercial(Comercial comercial) {
		this.comercial = comercial;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cliente=" + cliente + ", comercial=" + comercial + ", total=" + total
				+ ", fecha=" + fecha + "]";
	}

}
