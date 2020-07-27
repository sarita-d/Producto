package pe.edu.upeu.productos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.productos.dao.ProductoDao;
import pe.edu.upeu.productos.entity.Producto;

@SpringBootTest
class ProductosApplicationTests {
	@Autowired
	private ProductoDao productoDao;
	@Test
	void contextLoads() {
		productoDao.edit(new Producto( 5,"Trigo" , "4.00" , "20"));
		
	}

}
