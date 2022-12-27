package com.claro.WSBiblioteca.model.entity;

import java.io.Serializable;

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
@Table(name = "tipo_usuario", schema = "public")
@Getter
@Setter
@ToString
public class TipoUsuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_usuario", length = 10, nullable = false)
	private String id;
	
	@Column(name = "nombre", length = 30, nullable = false)
	private String nombre;
	
	@Column(name = "cantidad_prestamos", length = 30, nullable = false)
	private int cantidadPrestamos;	
	

}
