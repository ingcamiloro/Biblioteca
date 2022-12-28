package com.claro.WSBiblioteca.interfase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.claro.WSBiblioteca.model.entity.Producto;

@Repository
@Transactional
public interface ProductoRepositoryI extends JpaRepository<Producto, Integer> {


	@Query(value = "SELECT * FROM producto where titulo=?", nativeQuery = true)
    Producto buscarProducto(String titulo_libro);
}
