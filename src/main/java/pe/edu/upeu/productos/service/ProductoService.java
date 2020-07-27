package pe.edu.upeu.productos.service;

import java.util.List;

import pe.edu.upeu.productos.entity.Producto;

public interface ProductoService {
	List<Producto>readAll();
	int create (Producto produ);
	int edit (Producto produ);
	int delete(int id);
	Producto read(int id);
}
