package com.claro.WSBiblioteca.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.persistence.ParameterMode;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class ProductoDTO implements Serializable {
	public ProductoDTO(String string, int i, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9) {
		// TODO Auto-generated constructor stub
	}

	public ProductoDTO() {
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -7618741732297408457L;


	private String idProducto;

	private Integer idCategoria;


	private String fechaInactivacion;	
	

	private String cantidadEjemplares;


	private String maxPeriodoPrestamo;


	private String fechaLlegadaBiblioteca;

	private String titulo;

}

