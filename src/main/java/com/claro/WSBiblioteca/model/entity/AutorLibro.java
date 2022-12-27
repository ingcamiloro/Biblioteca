package com.claro.WSBiblioteca.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "autor_libro", schema = "public")
@Getter
@Setter
@ToString

@NamedStoredProcedureQuery(name = "sp_crear_mecanico", 
procedureName = "public.sp_crear_mecanico", parameters = {
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_producto", type = String.class),
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_categoria", type = String.class),
})
public class AutorLibro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_autor", length = 4, nullable = false)
	private String idAutor;
	
	@Id
	@Column(name = "id_producto", length = 10, nullable = false)
	private String idProducto;
}
