package com.claro.WSBiblioteca.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.claro.WSBiblioteca.dto.ProductoDTO;
import com.claro.WSBiblioteca.interfase.ProductoRepositoryI;
import com.claro.WSBiblioteca.model.entity.Categoria;
import com.claro.WSBiblioteca.model.entity.Producto;

public class ProductoRepositoryImpl implements ProductoRepositoryI{
	
	@Autowired
	private ProductoRepositoryI productoRepositoryI;
	
	@Override
	public List<ProductoDTO> consultarProducto(String idCategoria, String idAutor, int estado, String titulo,
			String fechaLlegada, String maxPeriodo) {
		List<ProductoDTO> listProductoDTO = new ArrayList<>();
		listProductoDTO = productoRepositoryI.consultarProducto(idCategoria, idAutor, estado, titulo, fechaLlegada, maxPeriodo);
		return listProductoDTO;
	}

	@Override
	public Categoria consultarProductoCategoria(String idCategoria) {
		Categoria categoria = new Categoria();
		categoria = productoRepositoryI.consultarProductoCategoria(idCategoria);
		return categoria;
	}

	@Override
	public Producto actualizarProducto(Date fechaInactivacion, String cantidadEjemplares, String maxPeriodo, int estado) {
		Producto producto = new Producto();
		producto = productoRepositoryI.actualizarProducto(fechaInactivacion, cantidadEjemplares, maxPeriodo, estado);
		return producto;
	}	

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Producto> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Producto> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Producto> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Producto> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Producto> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Producto> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Producto> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Producto> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Producto entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Producto> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Producto> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Producto> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Producto> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Producto> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
