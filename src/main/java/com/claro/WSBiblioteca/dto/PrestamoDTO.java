package com.claro.WSBiblioteca.dto;

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
@Table(name = "solicitar_prestamo", schema = "public")
@Getter
@Setter
@ToString
public class PrestamoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestamo", length = 10, nullable = false)
	private String idPrestamo;
	
	@Id
	@Column(name = "id_producto", length = 10, nullable = false)
	private String idProducto;
	
	@Id
	@Column(name = "id_libro", length = 10, nullable = false)
	private String idLibro;
	
	@Id
	@Column(name = "id_usuario", length = 10, nullable = false)
	private String idUsuario;
	
	
	@Column(name = "nombre_libro", length = 10, nullable = false)
	private String nombreLibro;
	
	@Column(name = "fecha_max_entrega", length = 10, nullable = false)
	private Date fechaMaxEntrega;
	
	@Column(name = "fecha_entrega", length = 10, nullable = false)
	private Date fechaEntrega;
	
	@Column(name = "cod_respuesta", length = 10, nullable = false)
	private String codRespuesta;
	
	
}
