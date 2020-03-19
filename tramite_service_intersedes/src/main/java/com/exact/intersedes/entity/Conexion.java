package com.exact.intersedes.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="conexion")
@Data
public class Conexion implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="conexion_id")
	private Long id;
	private String nombre;
	@Column(name="ruta_id")
	private String rutaId;
	
	@ManyToOne
	@JoinColumn(name="ruta_intersucursal_id")
	private RutaIntersucursal rutaIntersucursal;
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
