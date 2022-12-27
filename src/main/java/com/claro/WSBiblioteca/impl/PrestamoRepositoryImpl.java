package com.claro.WSBiblioteca.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.claro.WSBiblioteca.dto.PrestamoDTO;
import com.claro.WSBiblioteca.interfase.PrestamoRepositoryI;



public class PrestamoRepositoryImpl implements PrestamoRepositoryI {

	@Autowired
	private PrestamoRepositoryI prestamoRepositoryI;
	
	
	@Override
	public List<PrestamoDTO> consultarPrestamo(String idProducto, String idUsuario) {
		List<PrestamoDTO> listPrestamos = new ArrayList<PrestamoDTO>();
		listPrestamos =prestamoRepositoryI.consultarPrestamo(idProducto, idUsuario);
		return listPrestamos;
	}

	@Override
	public PrestamoDTO solicitarPrestamo(String idPrestamo, String idUsuario) {
		PrestamoDTO prestamoDTO = new PrestamoDTO();
		prestamoDTO = prestamoRepositoryI.solicitarPrestamo(idPrestamo, idUsuario);
		return prestamoDTO;
	}

	@Override
	public List<PrestamoDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PrestamoDTO> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PrestamoDTO> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PrestamoDTO> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends PrestamoDTO> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<PrestamoDTO> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PrestamoDTO getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PrestamoDTO> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PrestamoDTO> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<PrestamoDTO> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PrestamoDTO> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PrestamoDTO> findById(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PrestamoDTO entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends PrestamoDTO> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends PrestamoDTO> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends PrestamoDTO> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PrestamoDTO> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends PrestamoDTO> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
