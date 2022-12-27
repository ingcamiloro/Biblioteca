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
@Table(name = "usuario", schema = "public")
@Getter
@Setter
@ToString
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", length = 10, nullable = false)
	private String idUsuario;
	
	@Id
	@Column(name = "id_tipo_usuario", length = 10, nullable = false)
	private String idtipoUsuario;	
	
	@Column(name = "nombre_usuario", length = 30, nullable = false)
	private String nombreUsuario;
	
	@Column(name = "tipo", length = 10, nullable = false)
	private String tipo;	
	
	@Column(name = "numero", length = 10, nullable = false)
	private String numero;		

}
