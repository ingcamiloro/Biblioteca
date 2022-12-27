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

@Entity
@Table(name = "producto", schema = "public")
@Getter
@Setter
@ToString
//@IdClass(value = Autor.class)
@NamedStoredProcedureQuery(name = "sp_crear_mecanico", 
procedureName = "public.sp_crear_mecanico", parameters = {
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_producto", type = String.class),
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_categoria", type = String.class),
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inactivacion", type = Date.class),
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_cantidad_ejemplares", type = Integer.class),
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_max_periodo_prestamo", type = Integer.class),
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_llegada_biblioteca", type = Date.class),
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_titulo", type = String.class),

})
public class ProductoDTO implements Serializable {
	public ProductoDTO(String string, int i, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9) {
		// TODO Auto-generated constructor stub
	}

	public ProductoDTO() {
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -7618741732297408457L;

	@Id
	@Column(name = "id_producto", length = 10, nullable = false)
	private String idProducto;

	@Id
	@Column(name = "id_categoria", length = 2, nullable = false)
	private Integer idCategoria;

	@Column(name = "fecha_inactivacion", length = 12, nullable = false)
	private String fechaInactivacion;	
	
	@Column(name = "cantidad_ejemplares", length = 6, nullable = false)
	private String cantidadEjemplares;

	@Column(name = "max_periodo_prestamo", length = 2)
	private String maxPeriodoPrestamo;

	@Column(name = "fecha_llegada_biblioteca", length = 30, nullable = false)
	private String fechaLlegadaBiblioteca;

	@Column(name = "titulo", length = 100)
	private String titulo;

}

