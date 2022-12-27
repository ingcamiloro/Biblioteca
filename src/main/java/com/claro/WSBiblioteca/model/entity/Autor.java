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
@Table(name = "autor", schema = "public")
@Getter
@Setter
@ToString
public class Autor implements Serializable{
	private static final long serialVersionUID = -5235196532556803317L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_autor", length = 2, nullable = false)
	private Integer idAutor;

	@Column(name = "nombre_autor", length = 12, nullable = false)
	private String nombreAutor;		
}