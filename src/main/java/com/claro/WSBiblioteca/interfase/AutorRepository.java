package com.claro.WSBiblioteca.interfase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.claro.WSBiblioteca.model.entity.Autor;

@Repository
@Transactional() 
public interface AutorRepository extends JpaRepository<Autor, Integer> {
	@Query(value = "SELECT id_autor, nombre_autor  from autor;", nativeQuery = true)
	public Autor consultarAutor( String idAutor);
}
