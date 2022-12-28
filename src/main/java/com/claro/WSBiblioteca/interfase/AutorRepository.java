package com.claro.WSBiblioteca.interfase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.claro.WSBiblioteca.model.entity.Autor;

@Repository("autorrepo")
@Transactional
public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
