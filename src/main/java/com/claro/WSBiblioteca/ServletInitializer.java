package com.claro.WSBiblioteca;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

public class ServletInitializer extends SpringBootServletInitializer implements WebApplicationInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WSBibliotecaApplication.class);
	}

}
