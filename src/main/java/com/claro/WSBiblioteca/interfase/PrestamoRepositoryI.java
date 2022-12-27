package com.claro.WSBiblioteca.interfase;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.claro.WSBiblioteca.dto.PrestamoDTO;


@Repository
@Transactional() 
public interface PrestamoRepositoryI extends JpaRepository<PrestamoDTO, String> {

	@Query(value = "SELECT sp.idPrestamo, sp.idLibro, sp.nombreLibro, sp.fechaMaxEntrega, sp.fechaEntrega, sp.idUsuario from solicitar_prestamo sp;", nativeQuery = true)
	public List <PrestamoDTO> consultarPrestamo(String idProducto, String idUsuario);

	@Query(value = "SELECT sp.idPrestamo, sp.idLibro, sp.nombreLibro, sp.fechaMaxEntrega, sp.fechaEntrega, sp.idUsuario from solicitar_prestamo sp;", nativeQuery = true)
	public PrestamoDTO solicitarPrestamo(String idProducto, String idUsuario);

}
