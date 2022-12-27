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
@Table(name = "mantenimiento", schema = "public")
@Getter
@Setter
@ToString
public class Mantenimiento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mantenimiento", length = 4, nullable = false)
	private String idMantenimiento;
	
	@Id
	@Column(name = "id_producto", length = 10, nullable = false)
	private String idProdcuto;
	
	@Column(name = "fecha_inicio", length = 12, nullable =  false)
	private Date fechaInicio;
	
	@Column(name = "fecha_entrega", length = 12, nullable = true)
	private Date fechaEntrega;

}
