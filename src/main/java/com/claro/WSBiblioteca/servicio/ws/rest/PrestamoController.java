package com.claro.WSBiblioteca.servicio.ws.rest;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claro.WSBiblioteca.dto.PrestamoDTO;
import com.claro.WSBiblioteca.impl.PrestamoRepositoryImpl;
import com.claro.WSBiblioteca.interfase.PrestamoRepositoryI;

@RestController
@RequestMapping(path = "/prestamo")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST})
public class PrestamoController {

	private Logger logger = LogManager.getLogger(ProductoController.class);

	@Autowired
	private PrestamoRepositoryI prestamoRepositoryI;

	@PostMapping(path = "/solicitar/{idProducto}/{idUsuario}", produces = MediaType.APPLICATION_JSON_VALUE)
	public PrestamoDTO solicitarPrestamo(@PathVariable(required = true, name = "idProducto") String idProducto,
			@PathVariable(required = true, name = "idUsuario") String idUsuario) {
		
		String response = "";
		
		logger.info("--- INICIO TRANSACCION ---");
		logger.info("Se inicia consumo del servicio: " /*+ wsProxyDto.toString()*/);
		
		PrestamoDTO prestamoDTO = new PrestamoDTO();
		try {
			if (idProducto != null || idUsuario != null || idProducto != "" || idUsuario != "") {
				prestamoDTO = prestamoRepositoryI.solicitarPrestamo(idProducto, idUsuario);
			}	
			logger.info("Finalizacion consumo del servicio exitosa: /*  + wsProxyDto.toString() + */ Respuesta: "
					+ response);			
		}catch (Exception e) {
			logger.info("Error al consumir el servicio: /* + wsProxyDto.toString() + */ Respuesta: " + response);
		}
		return prestamoDTO;
	}

	@GetMapping(path = "/consultar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PrestamoDTO> consultarPrestamo(@PathVariable(name = "idPrestamo") String idPrestamo,
			@PathVariable(name = "idUsuario") String idUsuario) {
		List<PrestamoDTO> prestamoDTO = new ArrayList<PrestamoDTO>();
		if (idPrestamo != null || idUsuario != null || idPrestamo != "" || idUsuario != "") {
			prestamoDTO = prestamoRepositoryI.consultarPrestamo(idPrestamo, idUsuario);
		}
		return prestamoDTO;
	}
}
