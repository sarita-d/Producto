package pe.edu.upeu.productos.dao;

import java.util.List;

import pe.edu.upeu.productos.entity.Producto;

public interface ProductoDao {
	List<Producto>readAll();
	int create (Producto produ);
	int edit (Producto produ);
	int delete(int id);
	Producto read(int id);
}
