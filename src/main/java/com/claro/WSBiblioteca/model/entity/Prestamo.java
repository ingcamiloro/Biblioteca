package com.claro.WSBiblioteca.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "prestamo", schema = "public")
@Getter
@Setter
@ToString
public class Prestamo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestamo", length = 4, nullable = false)
	private String idPrestamo;
	
	@Id
	@Column(name = "id_producto", length = 10, nullable = false)
	private String idProducto;	
	
	@Id
	@Column(name = "id_usuario", length = 10, nullable = false)
	private String idUsuario;	
	
	@Id
	@Column(name = "id_padre", length = 10, nullable = false)
	private String idPadre;	
	
	@Column(name = "fecha_inicio_prestamo", length = 12, nullable = false)
	private Date fechaInicioPrestamo;
	
	@Column(name = "fecha_entrega", length = 12, nullable = false)
	private Date fechaEntrega;	
}
