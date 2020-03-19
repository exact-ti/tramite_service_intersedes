package com.exact.intersedes.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "envio_lote")
@Data
public class EnvioLote implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "envio_lote_id")
	private Long id;

	@Column(name = "paquete_codigo")
	private Long paqueteCodigo;

	@Column(name = "usuario_id")
	private String usuarioId;

	@ManyToOne
	@JoinColumn(name = "horario_conexion_id")
	private HorarioConexion horarioConexion;

	@Column(name = "fecha_inicio")
	private Date fechaInicio;
	
	@Column(name = "fecha_fin")
	private Date fechaFin;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
