package pe.edu.upeu.productos.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.productos.dao.ProductoDao;
import pe.edu.upeu.productos.entity.Producto;
import pe.edu.upeu.productos.service.ProductoService;
@Service
public class ProductoServiceImp implements ProductoService {
	@Autowired
	private ProductoDao productoDao;
	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return productoDao.readAll();
	}

	@Override
	public int create(Producto produ) {
		// TODO Auto-generated method stub
		return productoDao.create(produ) ;
	}

	@Override
	public int edit(Producto produ) {
		// TODO Auto-generated method stub
		return productoDao.edit(produ);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return productoDao.delete(id);
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return productoDao.read(id);
	}

}
