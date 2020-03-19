package com.exact.intersedes.entity;

import java.io.Serializable;
import java.sql.Time;

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
@Table(name="horario_conexion")
@Data
public class HorarioConexion implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="horario_conexion_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="conexion_id")
	private Conexion conexion;
	
	@Column(name="hora_inicio")
	private Time horaInicio;
	
	@Column(name="hora_fin")
	private Time horaFin;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
