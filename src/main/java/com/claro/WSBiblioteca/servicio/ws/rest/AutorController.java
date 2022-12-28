package com.claro.WSBiblioteca.servicio.ws.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claro.WSBiblioteca.interfase.AutorRepository;
import com.claro.WSBiblioteca.model.entity.Autor;

@RestController
@RequestMapping(path = "/autor")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST})
public class AutorController {

	private Logger logger = LogManager.getLogger(ProductoController.class);
	

	
	@GetMapping(path = "/consultar{idAutor}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Autor consultarAutor(@PathVariable(name = "idAutor") String idAutor) {
		Autor autor = new Autor();
		if (idAutor != null || idAutor != "") {
			// autor = autorRepository.consultarAutor(idAutor);
		}
		return autor;
	}
}
