package pe.edu.upeu.productos.entity;

public class Producto {
	private int idproducto;
	private String nomproducto;
	private String precio;
	private String cantidad;
	public Producto() {
		super();
	}
	public Producto(int idproducto, String nomproducto, String precio, String cantidad) {
		super();
		this.idproducto = idproducto;
		this.nomproducto = nomproducto;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNomproducto() {
		return nomproducto;
	}
	public void setNomproducto(String nomproducto) {
		this.nomproducto = nomproducto;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
}
