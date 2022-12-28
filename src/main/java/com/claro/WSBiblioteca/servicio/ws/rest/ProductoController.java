package com.claro.WSBiblioteca.servicio.ws.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claro.WSBiblioteca.dto.ProductoDTO;
import com.claro.WSBiblioteca.interfase.ProductoRepositoryI;
import com.claro.WSBiblioteca.model.entity.Categoria;
import com.claro.WSBiblioteca.model.entity.Producto;

@RestController
@RequestMapping(path = "/producto")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class ProductoController {

	// import org.apache.log4j.LogManager;
	private Logger logger = LogManager.getLogger(ProductoController.class);



	@GetMapping(path = "/consultar/{idCategoria}/{idAutor}/{estado}/{titulo}/{fechaLlegada}/{maxPeriodo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductoDTO> consultarPrestamo(@PathVariable(name = "idCategoria") String idCategoria,
			@PathVariable(name = "idAutor") String idAutor, @PathVariable(name = "estado") int estado, @PathVariable(name = "titulo") String titulo, 
			@PathVariable(name = "fechaLlegada") String fechaLlegada, @PathVariable(name = "maxPeriodo") String maxPeriodo) {
		
		List<ProductoDTO> productoDTO = new ArrayList<ProductoDTO>();
		if ( idCategoria != null || idAutor != null || estado  < 0 || titulo  != null || fechaLlegada  != null || maxPeriodo  != null || 
				idCategoria != "" || idAutor != "" || titulo  != "" || fechaLlegada  != "" || maxPeriodo  != "") {
			
			// productoDTO = productoRepositoryI.consultarProducto(idCategoria, idAutor, estado, titulo, fechaLlegada, maxPeriodo);

		}
		return productoDTO;
	}

	
	@GetMapping(path = "/consultar_producto_categoria/{idCategoria}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Categoria consultarProductoCategoria(@PathVariable(name = "idCategoria") String idCategoria) {
		
		Categoria categoria = new Categoria();
		if ( idCategoria != null || idCategoria != "" ) {
			// categoria = productoRepositoryI.consultarProductoCategoria( idCategoria );
		}
		return categoria;
	}
	
	
	
	@PutMapping(path = "/actualizar/{fechaInactivacion}/{cantidadEjemplares}/{maxPeriodo}/{estado}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Producto actualizarProducto(@PathVariable(name = "fechaInactivacion") Date fechaInactivacion,
			@PathVariable(name = "cantidadEjemplares") String cantidadEjemplares,
			@PathVariable(name = "maxPeriodo") String maxPeriodo,
			@PathVariable(name = "estado") Integer estado ) {
		
		Producto producto = new Producto();
		if ( fechaInactivacion != null || cantidadEjemplares != null || maxPeriodo != null || estado < 0 ) {
			// producto = productoRepositoryI.actualizarProducto(fechaInactivacion, cantidadEjemplares, maxPeriodo, estado);
		}
		return producto;
	}	
	/*
	 * @GetMapping("/categoria/consultar")
	 * 
	 * @ApiOperation(value = "Libros disponibles", notes =
	 * "Servicio REST para obtener los libros/productos disponibles.") public
	 * ResponseEntity<List<ProductoDTO>> productosDisponibles() { try {
	 * 
	 * return new
	 * ResponseEntity<List<ProductoDTO>>(service.consultarproductosDisponibles(),
	 * HttpStatus.OK); } catch (Exception e) { e.printStackTrace(); } return null; }
	 */

	/*
	 * @PostMapping("/add") public void addproducto(@RequestParam(name =
	 * "in_tipo_producto", required = true) String in_tipo_producto
	 * ,@RequestParam(name = "in_fecha_inactivacion", required = true) Date
	 * in_fecha_inactivacion ,@RequestParam(name = "in_cantidad_ejemplares",
	 * required = true) String in_cantidad_ejemplares ,@RequestParam(name =
	 * "in_producto", required = false) int in_producto ,@RequestParam(name =
	 * "int_max_periodo_prestamos", required = true) int int_max_periodo_prestamos
	 * ,@RequestParam(name = "in_categoria", required = false) String in_categoria
	 * ,@RequestParam(name = "in_fecha_llegada_biblioteca", required = true) Date
	 * in_fecha_llegada_biblioteca ,@RequestParam(name = "in_titulo_producto",
	 * required = true) String in_titulo_producto ,@RequestParam(name =
	 * "in_ids_autores", required = true) String in_ids_autores ,@RequestParam(name
	 * = "in_estado", required = true) String in_estado ){
	 * 
	 * 
	 * 
	 * logger.
	 * info("--------- INICIO DE METODO PARA ADICIONAR UN producto---------------");
	 * try { Pattern pattern = Pattern
	 * .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
	 * "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); Matcher mather =
	 * pattern.matcher(in_email);
	 * 
	 * if (!mather.find()) { logger.info("*** EL CORREO NO CUMPLE CON EL FORMATO:");
	 * throw new RequestException ("Formato de Email incorrecto");
	 * 
	 * }
	 * 
	 * ProductoDTO producto= new ProductoDTO();
	 * 
	 * producto.setTipoDocumento(in_tipo_documento);
	 * producto.setDocumento(in_documento);
	 * producto.setPrimerNombre(in_primer_nombre);
	 * producto.setSegundoNombre(in_segundo_nombre);
	 * producto.setPrimerApellido(in_primer_apellido);
	 * producto.setSegundoApellido(in_segundo_apellido);
	 * producto.setCelular(in_celular); producto.setDireccion(in_direccion);
	 * producto.setEmail(in_email); producto.setEstado(in_estado);
	 * 
	 * logger.
	 * info("El request con el que se consume el procedimiento sp_crear_producto:"+
	 * producto );
	 * 
	 * service.insertproducto(in_tipo_documento,in_documento,in_primer_nombre,
	 * in_segundo_nombre
	 * ,in_primer_apellido,in_segundo_apellido,in_celular,in_direccion,in_email,
	 * in_estado);}
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * }
	 */
}
