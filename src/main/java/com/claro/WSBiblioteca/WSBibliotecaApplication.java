package com.claro.WSBiblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc
public class WSBibliotecaApplication {

//	static {
//		Configurador.configurar(Constantes.RUTA_ARCHIVO_PROPIEDADES, UtilsConstantes.LOGGER_PRINCIPAL,
//				Constantes.APLICACION);
//	}
	public static void main(String[] args) {
		SpringApplication.run(WSBibliotecaApplication.class, args);
		
	}

}
