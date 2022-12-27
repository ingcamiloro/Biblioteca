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
@Table(name = "producto", schema = "public")
@Getter
@Setter
@ToString
public class Producto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto", length = 4, nullable = false)
	private String idProducto;
	
	@Id
	@Column(name = "id_categoria", length = 4, nullable = false)
	private String idCategoria;
	
	@Column(name = "tipo", length = 10, nullable = false)
	private String tipo;
	
	@Column(name = "fecha_inactivacion", length = 20, nullable = false)
	private Date fechaInactivacion;
	
	@Column(name = "cantidad_ejemplares", length = 10, nullable = false)
	private Integer cantidadEjemplares;
	
	@Column(name = "max_periodo", length = 10, nullable = false)
	private Integer maxPeriodo;
	
	@Column(name = "fecha_llegada", length = 10, nullable = false)
	private Date fechaLlegada;
	
	@Column(name = "titulo", length = 200, nullable = false)
	private String titulo;
	
	@Column(name = "estado", length = 1, nullable = false)
	private Integer estado;	

}
