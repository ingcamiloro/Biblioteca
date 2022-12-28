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

public class PrestamoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	

	private String idPrestamo;
	

	private String idProducto;
	

	private String idLibro;
	

	private String idUsuario;
	
	

	private String nombreLibro;
	

	private Date fechaMaxEntrega;
	

	private Date fechaEntrega;
	

	private String codRespuesta;
	
	
}
