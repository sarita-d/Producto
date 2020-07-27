package pe.edu.upeu.productos.daoimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.productos.dao.ProductoDao;
import pe.edu.upeu.productos.entity.Producto;
@Repository
public class ProductoDaoImp implements ProductoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from producto" ,
				BeanPropertyRowMapper.newInstance(Producto.class));
	}

	@Override
	public int create(Producto produ) {
		String sql ="INSERT INTO producto (nomproducto, precio, cantidad) VALUES (?,?,?)";
		return jdbcTemplate.update(sql, new Object[] {produ.getNomproducto(), produ.getPrecio(),produ.getCantidad()});
	}

	@Override
	public int edit(Producto produ) {
		String sql = "UPDATE producto SET nomproducto = ?, precio =?, cantidad =?  WHERE (idproducto =?)";
		return jdbcTemplate.update(sql, new Object[]  {produ.getNomproducto() , produ.getPrecio(), produ.getCantidad() , produ.getIdproducto()});
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM producto WHERE (idproducto =?)";
		return jdbcTemplate.update(sql, new Object[] {id});
	}

	@Override
	public Producto read(int id) {
		String sql = "select *from producto where idproducto=?";
		return jdbcTemplate.queryForObject(sql, 
		new Object[] {id}, BeanPropertyRowMapper.newInstance(Producto.class));
	}

}
