package pe.edu.cibertec.modelo;

public class VentaProducto {

	private final int idVenta;
	private final int idProducto;
	private final int idPersona;
	private final int cantidad;
	private final float monto;
	
	public VentaProducto(int idVenta, int idProducto, int idPersona, int cantidad, float monto) {
		super();
		this.idVenta = idVenta;
		this.idProducto = idProducto;
		this.idPersona = idPersona;
		this.cantidad = cantidad;
		this.monto = monto;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public int getCantidad() {
		return cantidad;
	}

	public float getMonto() {
		return monto;
	}
	
}
