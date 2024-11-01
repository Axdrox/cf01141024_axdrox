package mx.com.fractalyst.pdv.sc.c;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.fractalyst.pdv.sc.m.Producto;
import mx.com.fractalyst.pdv.sc.m.ProductosRepository;

@RestController
@RequestMapping("/productos")
public class ProductosController {

	@Autowired
	ProductosRepository repository;
	
	@PostMapping
	public Producto altaProducto(@RequestBody Producto product) {
		return repository.add(product);
	}
	
	@PutMapping
	public Producto actualizaProducto(@RequestBody Producto product) {
		return repository.update(product);
	}
	
	@GetMapping("/{id}")
	public Producto obtenProductoPorId(@PathVariable("id") Long id) {
		return repository.findById(id);
	}
	
	@PostMapping("/ids")
	public List<Producto> obtenProductosPorIds(@RequestBody List<Long> ids) {
		return repository.find(ids);
	}
	
	@GetMapping()
	public List<Producto> obtenProductosPorIds() {
		return repository.find();
	}

	@DeleteMapping("/{id}")
	public void eliminaProducto(@PathVariable("id") Long id) {
		repository.delete(id);
	}
	
}