package pe.edu.upeu.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.productos.entity.Producto;
import pe.edu.upeu.productos.service.ProductoService;

@RestController
public class ProductoController {
	@Autowired
	 private ProductoService productoService;
   /* Lista todos los productos ingresados por el MySql*/
	 @GetMapping("/productos")
	 public List<Producto> readList(){
		 return productoService.readAll();
	 }
	 /* Busca todos los productos ingresados por el MySql*/
	 @GetMapping("/productos/{id}")
	 public Producto read(@PathVariable int id){
		 return productoService.read(id);
	 }
	 /* Crea un producto ingresados por el Postman o por sts*/
	 @PostMapping("/producto")
	 public int create(@RequestBody Producto produ){
		 return productoService.create(produ);
	 }
	 /* Elimina un producto ingresados por el MySql o postman*/
	 @DeleteMapping("/delete/{id}")
	 public int del(@PathVariable int id){
		 return productoService.delete(id);
	 }
	 /* Edita un de los  productos ingresados por el MySql*/
	 @PutMapping("/producto/{id}")
	 public int edit(@RequestBody Producto produ,@PathVariable int id){
		 return productoService.edit(produ);
	 }
}
