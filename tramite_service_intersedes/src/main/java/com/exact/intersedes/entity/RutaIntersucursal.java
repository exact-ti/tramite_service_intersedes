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
@Table(name="ruta_intersucursal")
@Data
public class RutaIntersucursal implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ruta_intersucursal_id")
	private Long id;
	private String nombre;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
