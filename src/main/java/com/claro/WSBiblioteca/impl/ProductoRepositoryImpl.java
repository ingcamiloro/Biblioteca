package com.claro.WSBiblioteca.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.claro.WSBiblioteca.interfase.ProductoRepositoryI;
import com.claro.WSBiblioteca.model.entity.Producto;

@Service
public class ProductoRepositoryImpl {
	
	@Autowired
	private ProductoRepositoryI repo;


	public Producto buscar(){
		return  repo.findById(1).get();
	}



}
