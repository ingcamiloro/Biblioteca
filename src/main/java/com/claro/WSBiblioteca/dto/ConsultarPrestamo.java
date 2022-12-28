package com.claro.WSBiblioteca.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class ConsultarPrestamo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idPrestamo;
	private String idProducto;
	private String nombreLibro;
	private Date fechaMaxEntrega;
	private Date fechaEntrega;
	private String idUsuario;
	private String codRespuesta;
	
}
